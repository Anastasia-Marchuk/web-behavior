WebBehavior
This application help to estimate behavior of CCC web Application. Users are engineers and QA specialists from CCC team. 
The App helps check prices without using browsers manually. It makes work faster and more comfortable.

Getting Started

Install Gradle
On Unix
$ sudo add-apt-repository ppa:cwchien/gradle
$ sudo apt-get update
$ sudo apt-get install gradle
On Mac OS X

brew install gradle

Install Homebrew.

On Windows

Download from Gradle site.

Unzip the Gradle download to the folder to which you would like to install Gradle, eg. “C:\Program Files”. The subdirectory gradle-x.x will be created from the archive, where x.x is the version.

Add location of your Gradle “bin” folder to your path. Open the system properties (WinKey + Pause), select the “Advanced” tab, and the “Environment Variables” button, then add “C:\Program Files\gradle-x.x\bin” (or wherever you unzipped Gradle) to the end of your “Path” variable under System Properties. Be sure to omit any quotation marks around the path even if it contains spaces. Also make sure you separated from previous PATH entries with a semicolon “;”.

In the same dialog, make sure that JAVA_HOME exists in your user variables or in the system variables and it is set to the location of your JDK, e.g. C:\Program Files\Java\jdk1.7.0_06 and that %JAVA_HOME%\bin is in your Path environment variable.

Open a new command prompt (type cmd in Start menu) and run gradle –version to verify that it is correctly installed.

Set up the project
Clone this repo to your local machine using:

https://github.com/AnastasiaMarchuk/WebBehavior

------------------------------------
Build Java code
Now we are behind few step.

Application deployment

Start your apache using command "apachect -k start"
We are almost done just deploy the project with the command "gradle build". Now you can see the output

  > Task :compileJava
  > Task :processResources NO-SOURCE
  > Task :classes
  
  > Task :SeleniumRL.main()

  Checking the price...
  Correct price!

  BUILD SUCCESSFUL
  Total time: 9 secs

--------------------------

Technology stack
Spring Framework
Hibernate
Gradle

License
MIT
