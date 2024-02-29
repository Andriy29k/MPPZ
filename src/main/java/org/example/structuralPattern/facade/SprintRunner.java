package org.example.structuralPattern.facade;

public class SprintRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.solvedProblems();
        workflow.endSprint();
    }
}
