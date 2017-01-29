# Restaurent Menu

This is Knapsack0/1 problem solved using Java8/SpringBoot Application developed on Intellij Idea using Build Tool Gradle.

For writing Test cases spring-boot-starter-test is used.

while running test cases it is using the data.txt from test/resourses.

This application read the item having weight(time) and value(satisfaction) from Menu (text file data.txt).
And find out the maximum value(Satisfation) for given weight(time) .

When you run this application it will display Maximum Satisfaction value for given time on Console.

How To Run:- To run this application you must have installed Java8, and Gradle is for build the Jar File.

Clone GIT Repo Using git@github.com:jadh39/restaurentmenu.git

got to root directory and run gradle clean build command

:~/restaurentmenu$ gradle clean build

You can run this application using gradle command or java command, You have to pass the time for which you want to find the maximum satisfaction at runtime using command line arguments

run using gradle

:~/restaurentmenu$ gradle bootRun -Pargs="100" #command line argument time

Using java command

:~/restaurentmenu$ java -jar ./build/libs/restaurentmenu.jar 100 #command line argument time

It will show the out put on the console
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.4.3.RELEASE)

2017-01-29 02:43:09.008  INFO 3200 --- [           main] com.restaurent.menu.MainClass            : Starting MainClass on prashant-VirtualBox with PID 3200 (/home/prashant/restaurentmenu/build/libs/restaurentmenu.jar started by prashant in /home/prashant/restaurentmenu)
2017-01-29 02:43:09.018  INFO 3200 --- [           main] com.restaurent.menu.MainClass            : No active profile set, falling back to default profiles: default
2017-01-29 02:43:09.267  INFO 3200 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@5f4da5c3: startup date [Sun Jan 29 02:43:09 GMT 2017]; root of context hierarchy
2017-01-29 02:43:12.601  INFO 3200 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2017-01-29 02:43:12.615  INFO 3200 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
2017-01-29 02:43:12.872  INFO 3200 --- [           main] com.restaurent.menu.MainClass            : Started MainClass in 6.177 seconds (JVM running for 9.618)
--------------------------------------------------------------------------------------
Maximum Satisfaction is 238103
--------------------------------------------------------------------------------------
2017-01-29 02:43:12.927  INFO 3200 --- [       Thread-1] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@5f4da5c3: startup date [Sun Jan 29 02:43:09 GMT 2017]; root of context hierarchy
2017-01-29 02:43:12.952  INFO 3200 --- [       Thread-1] o.s.c.support.DefaultLifecycleProcessor  : Stopping beans in phase 0
2017-01-29 02:43:12.963  INFO 3200 --- [       Thread-1] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown

 
