Spring Roo CloudBees Demo App
=============================

### This application is configured using Spring Roo 1.2.1 with Spring Data JPA and Service Layer

### [Spring Roo](http://www.springsource.org/spring-roo "Roo")
### [Spring Roo in Action](http://www.manning.com/rimple "Roo in Action")
### [Blog Post: Buzzing the Cloud with CloudBees](http://gordondickens.com/wordpress/2011/09/26/buzzing-the-cloud-with-cloudbees-and-roo/ "Blog Post")
### [CloudBees.com](http://cloudbees.com "CloudBees")


---

Building from Scratch via Roo Script
------------------------------------
* To build from scratch, use the _roobees121.roo_ script.

---

Setting your MySql Credentials
------------------------------
* Change the MySql credentials in the _roobees121.roo_ script file
* And in _src/main/webapp/WEB-INF/cloudbees-web.xml_

---

Customizing the Roo Template
----------------------------
1. Change Colors in _src/main/webapp/styles/standard.css_

   \#005696  --> \#005696

   \#607890  --> \#607890

   \#0000FF  --> \#0000FF

2. Replace the _src/main/webapp/WEB-INF/images_

    _banner-graphic.png_

    _chariot-logo.png_

    _en.png_ (US flag)

    _favicon.ico_


3. Change Company Name & Welcome Text in _src/main/webapp/WEB-INF/i18n/messages.properties_

    _global\_sponsored=Chariot Solutions_

    _welcome\_text=Chariot Solutions provides application architects for enterprise, open source application development, mentoring and training._


4. Change logo and url _src/main/webapp/WEB-INF/views/footer.jspx_
Change:

    `<spring:url value="/resources/images/chariot-logo.png" var="logo"/>`

    `<a href="http://chariotsolutions.com" title="${fn:escapeXml(sponsored)}">`


---

Best Regards,

Gordon Dickens

Mail: [gordon@gordondickens.com](mailto:gordon@gordondickens.com "email")

Twitter: [http://twitter.com/gdickens](http://twitter.com/gdickens "Twitter")

LinkedIn: [http://linkedin.com/in/gordondickens](http://linkedin.com/in/gordondickens "LinkedIn")

Blog: [http://technophile.gordondickens.com](http://technophile.gordondickens.com "Blog")
