package org.example.structuralPattern.facade;

public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solvedProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

    public void endSprint(){
        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
