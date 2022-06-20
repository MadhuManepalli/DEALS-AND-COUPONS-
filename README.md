A casestudy on Deals and Coupons
Flow :-

->open the website ->Home page contains some detailed information of the website,About us,Services,Contact and Some data about the webpage) ->Login ->After login it will navigate to admin page

->For Users Logining in to the coupons page login using Google Auth.

->Navigate to deals or coupons page

-> Search For Respective Coupons

->Select the coupons required or user can save them to use it later (when user click on show coupon code it will show the code)

Microservices used in this casestudy

1.Admin.
2.Loginservice.
3.coupons.
4.users.

These microservices will regester in Eureka Server.
And Zuul API Gateway is used to access the all microservices data through unquie port.
