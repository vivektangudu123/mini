<a name="br1"></a> 

**CS 816 - Software Production Engineering**

**Mini Project - Scientific Calculator with DevOps**

**-** Vivek Tangudu(IMT2020110)

**GitHub Link**

[**vivektangudu123/mini**](https://github.com/vivektangudu123/mini)

**DockerHub Link**

[**bean6792/calculator**](https://hub.docker.com/repository/docker/bean6792/calculator/general)

**Pipeline Script**

[**https://github.com/vivektangudu123/mini/blob/main/Jenkinsfile**](https://github.com/vivektangudu123/mini/blob/main/Jenkinsfile)

**CONTENTS**

● Problem Statement

● Setting up tools

**●** Java

● Maven

● Intellij

● Jenkins

● Docker

● Ansible

● Ngrok

● Git

● Git workflow

● Folder Structure

● Running the container

● Challenges



<a name="br2"></a> 

**Problem Statement**

DevOps is like teamwork for making and launching

software. It helps teams work well together to release apps

faster. In our project, we're building a scientific calculator with

tools like GitHub, Maven, JUnit, Jenkins, Ansible, and Docker.

We're using Jenkins to make a special way of working called a

pipeline, which helps us learn about Continuous Integration,

Continuous Deployment, and managing settings.

In the past, developers and operations teams didn't always

get along. Developers wanted to add new stuff, but operations

folks worried about system stability. DevOps is like a

peacemaker, helping everyone work together smoothly. Our

project shows how DevOps can boost productivity by bringing

developers and operations folks together.

We're going to create a basic calculator program in Java with

functions like finding the addition,subtraction,multiplication and

percentile functions. But our main focus is not on writing the

code itself. Instead, we want to understand and set up the

DevOps (Development and Operations) process. To do this, we'll

use various tools like Git, GitHub, Jenkins, Docker, Ngrok, and

Ansible.

Later, we'll put together a Jenkins pipeline. This pipeline will help

us automate the steps of building, testing, and deploying our

code with just a single click.

**Tools used for:**

● Source control management: git and Github

● To perform webhooks: ngrok



<a name="br3"></a> 

● Automate the build the process: Github webhook

● Code editor : Intellij

● Building and packaging the code: Maven

● Continuous Integration: jenkins

**Installation and Setting up tools**

**1. Java**

● brew install java

● Java –version

●

**2. Maven**

● brew install maven

● mnv -v

Maven helps to build a dependency management tool for

Java projects that automates the compilation, testing, and

distribution of your code.

**3. Git**

● brew install git

● git version

**4. Docker**

● Brew install docker

● Docker –version

Docker simplifies the process of developing, shipping, and

running applications inside lightweight, portable containers.

**5. Intellij**

Installed through web :

<https://www.jetbrains.com/idea/download/>



<a name="br4"></a> 

**6. Jenkins**

● brew install jenkins

● brew install jenkins-lts

● brew services start jenkins-lts

● Open localhost:8080

● Install required plugins.

● It will give a path where we can find the initial

password and create a new user in jenkins.

● Install plugins related to docker,ansible,git,github.

●

Jenkins helps to automate the delivery process and

facilitate continuous integration and continuous delivery

(CI/CD).

**7. ngrok**

● brew install ngrok

● ngrok -version

● ngrok http 8080

**8. Ansible**

● Brew install ansible

● ansible --version

Ansible simplifies tasks like software installation, updates,

configuration changes, and application deployments across multiple

machines. Ansible uses a simple and human-readable language to

define automation tasks, making it easy to create and maintain

automation scripts.



<a name="br5"></a> 

**Git workflow**

Build the project in the local repository that uses maven to build, now I

need to push the code into github to automate the build process. It

also helps in version control and helps to save the code of several

versions.

● Initiate git in the local directory: *git init*

● To check the status of repository: *git status*

● To clone the remote repo to local : *git clone < remote repo URL*

*>*

● After adding files in local repository, we add to the staging area :

*git add*

● Commit changes: git commit -m “message”

● To check the changes and who made the changes and also with

branches: *git log*



<a name="br6"></a> 

● Push into the remote repo: *git push*

●

Add the link to the current local repository with the use of git

remote add :

*git remote add origin < link of remote repo>*

**Folder Structure**



<a name="br7"></a> 

.idea – config files for intellij

Deployment - Files for Ansible

Src - java source code

Resources - config files for log4j2 dependency

.gitignore - git ignores files mentioned here

Pom.xml - config file for maven

Dockerfile - config file for docker

Jenkinsfile - pipeline script for jenkins

**Create a repo in github:**



<a name="br8"></a> 

**Intellij , Maven and JUnit :**

We use Java to build our project as it is system independent and

we use IDE Intellij. Maven streamlines our Java project development

by automating builds. It's Java-based and makes it effortless to

incorporate dependencies and generate executable JAR files,which

helps to execute on any platform. Maven's Project Object Model (POM)

outlines the project structure, its dependencies, and the build process.

The POM.xml file holds project details like name, version, and

dependencies. Adding project dependencies is a simple process, simply

update the pom.xml file. Maven ensures easy dependency

management, facilitating the conversion of projects into portable JAR

files. Its extensive plugins empower developers to deploy, document,

and test applications seamlessly.



<a name="br9"></a> 

We use JUnit to check our code. In our project, we have

three main tags: @before, @test, and @after. The @test tag tells us

which methods are for testing. Before every test, the @before method

runs, and after every test, the @after method runs. This helps set up

and finish tests properly. We use assertEquals to see if our test results

are as expected. If not, it gives us a message about the error. We also

use assertNotEquals to check if results are different when they should

be.

Add JUnit, logger dependencies in pom.xml file

Junit helps to test the code and logger helps to write logs in a log file

when executing the code.

Along with the dependencies,we also include a maven plugin, to create

a jar with all dependecies,eliminating the need to separately install

these dependencies on the system where the jar file will be executed.

We have to create **“**log4j.xml” in

**“**calculator/src/main/resources/log4j2.xml”.



<a name="br10"></a> 

Log4j2.xml is a configuration file of how to set up logging in a Java

application using Log4j2.xml, allowing developers to track and analyze

the application's behavior by logging various messages.

We set a pattern of message that needs to has to be written in the

format of “%d{dd/MM/yyyy:HH:mm:ss SSS}{IST} [%F] [%level] %logger{36}

%msg%n”

Add logger method in main.java and logger.info in methods of

main.java

**“ private static final Logger *logger* = LogManager.*getLogger*(Main.class);”**

Run test cases using maven - *mvn test*



<a name="br11"></a> 

Build the jar file with maven using the command: *maven install*

This created a folder named target and we have the jar that we can

run manually:

To run the jar file:

*Move to the target folder.*

*Java -jar <name of jar folder >*

Now, it's time to push our code to github.using the commands:

*git add . && git commit -m “<message> && git push*

*We need to provide a git username and auth token to push the code.*



<a name="br12"></a> 

→ This is the time to create a new pipeline in jenkins.



<a name="br13"></a> 

**Step 1: Git clone**

In configure,add the pipeline script

It clones the repo from the url in that branch (master).

As the repo is public,no need to give credentials of github.If the repo is

private, we need to do so.

**Step 2: Build using maven**

Second step is to build using the code.



<a name="br14"></a> 

-> mvn clean install will build the jar file. One with dependencies and

another with not.



<a name="br15"></a> 

**Step 3** : **Build docker image**

We would be to create docker image using docker

Create a Dockerfile in the project folder and add the commands to

create a dockerfile.

In the jenkins pipeline the next step is to build the image.

“Bean6792” is my username of docker

In the terminal, we can run the command - *docker images* to see the

created images in the system.



<a name="br16"></a> 

**Step 4: Push the docker image into hub**

Docker-red has my docker credentials in jenkins credentials. This will

push the created image to the remote hub.



<a name="br17"></a> 

**Step 5 : Clean docker images**

**Step 6: Ansible**

Docker container prune -f && docker image prune -f will clean all the images

and containers which are stopped.

Docker -ps -aq will list all containers and the remaining two will delete all

containers.



<a name="br18"></a> 

**$ ansible-playbook Deployment/inventory -i Deployment/inventory**

This is the command that is going to run. Deploy.yml is the name of the

playbook file that will be executed. The inventory file that Ansible should use

to determine which host is going to run the playbook.

We have the commands that need to run the docker in deploy.yml



<a name="br19"></a> 

We have two tasks

Task1: Pull the image *docker pull <docker image name with tag or*

*image id>*

Task2 : Run the image *docker run -it -d --name <container name>*

*<image\_name>*

**Webhook**

To automate the build process, let’s create a webhook to automate the

build process when a change is made.

Using ngrok we can create a link which can trigger the change from

github. Using the command

*Ngrok http 8080*



<a name="br20"></a> 

Change the jenkins URL in the system and paste the given link. Add A

github server with credentials.

Add a webhook in the repo settings of the repo.



<a name="br21"></a> 

When the trigger is triggered, github sends the changes to the port

8080 as we configured before.

Now When there is a change in the code and that was pushed to

github,jenkins automates the build process and tests the code with tests that

were given.

**Let’s run the docker image**

The 1st command lists all the images that were present in system *docker*

*images*

2nd command will run the image and creates an container *docker run -it -d*

*--name <new name for container> <image name>*



<a name="br22"></a> 

To execute the container : *docker start -a -i <name of container>*

Log file in that container

**Challenges**

\1) Intilally jenkins ran on <http://127.0.0.1:8080>[ ](http://127.0.0.1:8080)but not on

localhost:8080.Reset that in the config file.

\2) Jenkins needs to know the bin folder of the systems bin paths to

execute maven, python or anything. Need to change a file in .jenkins

and add paths.

\3) Not able to understand the syntax in deploy\.yml\. And tried to rewrite

the script path and wrote the command in shell script.

