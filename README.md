THIS IS README FILE FOR PROJECT
=========================================

This is a test project written by React and JAVA.

It has two sub applications i.e one for frontend and second for backend.

## 0.GIT CLONE
https://github.com/jinghuang0319/shipping.git 

## 1.Back-end
In back-end, I used java and MVC(Module, view, control) to contribute back-end,The name of project is item,there are four layer involved, bean, dao, service,servlet.

![](https://github.com/jinghuang0319/shipping/blob/master/image/591a9fa309f5dfcd22837cc69f5d4eb.png)

### Installations
   * open backEnd project by eclipse or something else tools
   * configure service within project, like tomcat.
   * run the service
   
### Junit test
    In backend, i uesd Junit test to test function.there are two test class under the test folder,one is CountryDaoImplTest
	and the other one is OrderBoxDaoImplTest.
   ![](https://github.com/jinghuang0319/shipping/blob/master/image/test1.png)
    on the class,right click,choose 'Run As',then choose 'JUnit Test'
	![](https://github.com/jinghuang0319/shipping/blob/master/image/test2.png)
	there is result will show on the left
	![](https://github.com/jinghuang0319/shipping/blob/master/image/test3.png)
## 2.Database:
there are two sql file in file.sql folder, one is boxs.sql,and the other one is countrys.sql
Configuration of Database, In BaseDao class,

![](https://github.com/jinghuang0319/shipping/blob/master/image/d72e1a0c82565b3c89a0793e8f7c089.png)

In this class, you need connect in your local database.

![](https://github.com/jinghuang0319/shipping/blob/master/image/880e4860ba89400e8be737c5a503483.png)

## 3.Configuration of service,
In my project, i have run two service in local computer, one is for react ,and other is for back-end, configure different port number is necessary, i have configure the port number in the back-end side

![](https://github.com/jinghuang0319/shipping/blob/master/image/9662b7e2c4ac57d897ac906d1440e39.png)

## 4.front-end

 ### Installations
   * Install npm packages, inside frontEnd/ run `npm install`
   * Run the application inside, frontend/ run the command `npm start`
   * Browse to the url `http://localhost:8080/#/addbox`
  
   ![]( https://github.com/jinghuang0319/shipping/blob/master/image/d0b7a44d6c6283bcca7a9b0093b8dbc.png)
   * Browse to the url `http://localhost:8080/#/listboxes`
   
   ![](https://github.com/jinghuang0319/shipping/blob/master/image/a607c9c0db17d888c52020ce53d5fee.png)


 ### Mocha test
   In the front-end, i used Mocha test to test function, the test js under the test folder. and there are three test function 
   have be code in the firstTest.js
   ![](https://github.com/jinghuang0319/shipping/blob/master/image/test4.png)
   Run the application inside, frontend/ run the command `npm run test`, the test result will be show on terminal 
   ![](https://github.com/jinghuang0319/shipping/blob/master/image/test5.png)
   