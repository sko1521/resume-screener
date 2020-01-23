package com.springernature.resumescreener.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jobPost")
public class JobInfo {
    @Id
    @JsonProperty("jobId")
    private String jobId;

    @JsonProperty("jobTitle")
    private String jobTitle;

    @JsonProperty("experience")
    private String experience;

    public JobInfo() {
    }

    public JobInfo(String jobId, String jobTitle, String experience) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.experience = experience;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "JobInfo{" +
                "jobId='" + jobId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}
