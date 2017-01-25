# restaurentmenu
This is Java8/SpringBoot Application developed on Intellij Idea using Build Tool Gradle.

For writing Test cases spring-boot-starter-test is used.

while running test cases it is using the data.txt from test/resourses.

This application is for read the content of the Restautrent Menu (text file data.txt) that contains Satisfaction Value and time to eat,
And find out the hinghest Satisfation Value.

When you run this application it will display Maximum Satisfaction value of the Menu on Console.

How To Run:- To run this application you must have installed Java8, and Gradle is for build the Jar File.

Clone GIT Repo Using git@github.com:jadh39/restaurentmenu.git

got to root directory and run gradle clean build command

:~/restaurentmenu$ gradle clean build

You can run this application using gradle command or java command

run using gradle

:~/restaurentmenu$ gradle bootRun

Using java command

:~/restaurentmenu$ java -jar ./build/libs/restaurentmenu.jar 

It will show the out put on the console
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.4.3.RELEASE)

2017-01-25 06:12:41.211  INFO 4961 --- [           main] com.restaurent.menu.MainClass            : Starting MainClass on prashant-VirtualBox with PID 4961 (/home/prashant/restaurentmenu/build/libs/restaurentmenu.jar started by prashant in /home/prashant/restaurentmenu)
2017-01-25 06:12:41.219  INFO 4961 --- [           main] com.restaurent.menu.MainClass            : No active profile set, falling back to default profiles: default
2017-01-25 06:12:41.366  INFO 4961 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@5f4da5c3: startup date [Wed Jan 25 06:12:41 GMT 2017]; root of context hierarchy
2017-01-25 06:12:44.452  INFO 4961 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2017-01-25 06:12:44.517  INFO 4961 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
2017-01-25 06:12:44.782  INFO 4961 --- [           main] com.restaurent.menu.MainClass            : Started MainClass in 4.688 seconds (JVM running for 6.017)
--------------------------------------------------------------------------------------
Maximum Satisfaction is 99506
--------------------------------------------------------------------------------------
2017-01-25 06:12:44.832  INFO 4961 --- [       Thread-1] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@5f4da5c3: startup date [Wed Jan 25 06:12:41 GMT 2017]; root of context hierarchy
2017-01-25 06:12:44.838  INFO 4961 --- [       Thread-1] o.s.c.support.DefaultLifecycleProcessor  : Stopping beans in phase 0
2017-01-25 06:12:44.856  INFO 4961 --- [       Thread-1] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown

 
