# BlazeDemo
BlazeDemo_Assesment

Web UI and API Automation with Selenium 

**Table of Contents**
  There are a few things we need before running the tests. These are:
  _1. Java Installation / Update_
_  2. Setting up Eclipse_

	Installing TestNG
	Setting up Maven
_  3. Running the Project_

	From Eclipse
	From Terminal
_  4. Technologies Used _
 _ 5. Project Contents_
	
**Java Installation / Update**
Check your system to see if you have the latest Java version installed.

Command:

$ java -version

Ensure your JAVA_HOME environment to the location of the installed JDK

**Setting up Eclipse**
Navigate to the Eclipse download page and download eclipse for Java EE developers.
**Installing TestNG**
Installing a Plugin:

Inside Eclipse, click on the Help menu
Select TestNG from Eclipse MarketPlace.

**Setting up Maven**
1. Download Maven

2. Unzip the distribution archive to the directory you wish to install Maven. I extracted maven to my Documents folder

3. Add Maven to the PATH. More information can be found in the README.txt in the zip folder.

Here's an example of how I added Maven to my PATH on MacOS. I added the folowing to the ~/.bash_profile.
$ export PATH=/Users/admin/Documents/Software/apache-maven-3.5.0/bin:$PATH
Then sourced (execute) the content of the ~/.bash_profile
$ source ~/.bash_profile
4. Verify Maven was correctly installed

5. Command:
$ mvn –version
Maven dependencies are crucial to running any Maven project.

**Technologies Used **
1. Java
2. Selenium
3. TestNG

**Project Contents**
1. Clone this project.
2. Setup the project in Eclipse.
3. Change the URL in basetest to launch specific URL.
4. Run the test using TestNG.
