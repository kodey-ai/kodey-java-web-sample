# kodey-java-web-sample

This repository is an example Kodey.ai Coding Agent Workflow

## Objectives

In this sample, we will explore how Kodey.ai can create projects and integrate serverless code and automate it.

## Project Setup & Steps 

1. Signup for a new Kodey.ai account or login to your existing Kodey.ai environmenty (link-here)
2. Configure your Kodey.ai integrations to the desired issue tracker and cloud git provider.
3. Fork this repository, and clone it to the cloud git provider of your choosing (Github, Azure DevOps, Bitbucket)
4. Create a new branch dev in your repo. Kodey will create new branches out of dev branch.
5. Create the sample issue / work item in your issue tracker. Copy and Paste the issue description from below.
6. Execute the below prompt in the Kodey.ai chat UI
7. Validate the commits and pull requests in your cloud git provider

### SAMPLE PROMPT - Github Tools (Making Project That hits API requests extract data and define serverless file)
```
    repository to work on: kodey-java-web-sample

    branch name to create: feature/kodey-java-web-sample-v1

    platform: github

    Information to agent: Do as the steps below are defined one by one. You are working in guthub repo so make sure to use tools related to github repo.

    SCENARIO: You are working in a project that involves creating a web portal where students submitting their information via a form and it should be saved in database. You should be working with Java Servlet framework for the backend. Creating necessary models, routing files, etc is your responsibility along with all the HTML, CSS, JS scripts. Make the use of postgres database.

    IMPORTANT NOTE: While executing every steps remember to write the actual implementation of code not just comments. Do not leave placeholders for code. Write full code with the logic described in task.

    Steps:

    step 1: Create a new branch with name first and then do the steps below.

    step 2: Create a pom.xml file in root directory that has dependency required to connect to postgres database with servlet app.

    step 3: Create a student model object file in src directory that has field like user, full name, roll no, semester,etc. Make proper use of schema.

    step 4: Create a servlet that will handle the form submission and insert student details into the PostgreSQL database. Make sure to have GET, POST, PUT endpoints.

    step 5: Create necessary HTML, CSS, JS files for the frontend in the root directory and make sure to use the correct references and scripts to the java classes created above, so that user can interact via a WEB UI.

    step 6: Update README.md inside root folder and put all the details of the project including how to run.

    step 7: Create a new pull request from the above created branch with title "Java Web App Servlet v1".

    step 8: Update this issue status to closed.

```

### SAMPLE PROMPT - Azure DevOps Tools (Making Project That hits API requests extract data and define serverless file)
```
    repository to work on: kodey-java-web-sample

    branch name to create: feature/kodey-java-web-sample-v1

    platform: azure

    Information to agent: Do as the steps below are defined one by one. You are working in azure repo so make sure to use tools related to azure repo.

    SCENARIO: You are working in a project that involves creating a web portal where students submitting their information via a form and it should be saved in database. You should be working with Java Servlet framework for the backend. Creating necessary models, routing files, etc is your responsibility along with all the HTML, CSS, JS scripts. Make the use of postgres database.

    IMPORTANT NOTE: While executing every steps remember to write the actual implementation of code not just comments. Do not leave placeholders for code. Write full code with the logic described in task.

    Steps:

    step 1: Create a new branch with name first and then do the steps below.

    step 2: Create a pom.xml file in root directory that has dependency required to connect to postgres database with servlet app.

    step 3: Create a student model object file in src directory that has field like user, full name, roll no, semester,etc. Make proper use of schema.

    step 4: Create a servlet that will handle the form submission and insert student details into the PostgreSQL database. Make sure to have GET, POST, PUT endpoints.

    step 5: Create necessary HTML, CSS, JS files for the frontend in the root directory and make sure to use the correct references and scripts to the java classes created above, so that user can interact via a WEB UI.

    step 6: Update README.md inside root folder and put all the details of the project including how to run.

    step 7: Create a new pull request from the above created branch with title "Java Web App Servlet v1".

    step 8: Update this issue status to closed.
```

### SAMPLE PROMPT - Jira / Bitbucket (Making Project That hits API requests extract data and define serverless file)
```

    repository to work on: kodey-java-web-sample

    branch name to create: feature/kodey-java-web-sample-v1

    platform: bitbucket

    Information to agent: Do as the steps below are defined one by one. You are working in bitbucket repo so make sure to use tools related to bitbucket repo.

    SCENARIO: You are working in a project that involves creating a web portal where students submitting their information via a form and it should be saved in database. You should be working with Java Servlet framework for the backend. Creating necessary models, routing files, etc is your responsibility along with all the HTML, CSS, JS scripts. Make the use of postgres database.

    IMPORTANT NOTE: While executing every steps remember to write the actual implementation of code not just comments. Do not leave placeholders for code. Write full code with the logic described in task.

    Steps:

    step 1: Create a new branch with name first and then do the steps below.

    step 2: Create a pom.xml file in root directory that has dependency required to connect to postgres database with servlet app.

    step 3: Create a student model object file in src directory that has field like user, full name, roll no, semester,etc. Make proper use of schema.

    step 4: Create a servlet that will handle the form submission and insert student details into the PostgreSQL database. Make sure to have GET, POST, PUT endpoints.

    step 5: Create necessary HTML, CSS, JS files for the frontend in the root directory and make sure to use the correct references and scripts to the java classes created above, so that user can interact via a WEB UI.

    step 6: Update README.md inside root folder and put all the details of the project including how to run.

    step 7: Create a new pull request from the above created branch with title "Java Web App Servlet v1".

    step 8: Update this issue status to closed.

```

## Once you have set the description of the issue in your relavant system. You need to use kodey UI Chat and execute below statement to get the work done. 

### Github Issue and Github Repo
```
   Get the issue with id <issue_id> from github repo and do as the description of the issue says.
```

### Azure Repo Issue and Azure Repo
```
   Get the issue with id <issue_id> from azure repo and do as the description of the issue says.
```

### Jira Issue and Bitbucket Repo
```
   Get the issue with id <issue_id> from jira and do as the description of the issue says.
```

## Confirming Successful Sample Outputs

1. Confirm that the branch was created on the issue / work item
2. Confirm that the code created in the associated pull request contains the following
3. Confirm that the work item/issue/ticket in your relevant issue tracking platform is updated.% 