package com.springernature.resumescreener.service;

import com.springernature.resumescreener.domain.JobInfo;
import com.springernature.resumescreener.repository.JobRepository;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JobServiceTest {

    private List<JobInfo> list = asList(
            new JobInfo("1", "jobtitle", "1yr")
    );

    private List<JobInfo> emptyList = Arrays.asList();


    @InjectMocks
    private JobServiceImpl jobService;

    @Mock
    private JobRepository jobRepository;


    @Test
    void Should_Return_Records_If_Present_In_Database() {
        Mockito.when(jobRepository.findAll()).thenReturn(list);
        List<JobInfo> actual = jobService.allJobPost();
        assertThat(actual, equalTo(list));
    }

    @Test
    void should_return_empty_list_if_no_records_in_database() {
        Mockito.when(jobRepository.findAll()).thenReturn(emptyList);
        List<JobInfo> actual = jobService.allJobPost();
        assertThat(actual,equalTo(emptyList));
    }
}