$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/WorkSapace/Custody_Automation/src/test/java/Features/FacebookLogin.feature");
formatter.feature({
  "name": "FacebookLogin",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validation of login functinality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sainty"
    }
  ]
});
formatter.step({
  "name": "user launch url for facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookStepDef.user_launch_url_for_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the user credentials",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookStepDef.user_enters_the_user_credentials()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.SearchContext.findElement(org.openqa.selenium.By)\" because \"this.searchContext\" is null\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy16.click(Unknown Source)\r\n\tat pageObject.FacebookPage.login(FacebookPage.java:42)\r\n\tat stepDefination.FacebookStepDef.user_enters_the_user_credentials(FacebookStepDef.java:25)\r\n\tat ✽.user enters the user credentials(D:/WorkSapace/Custody_Automation/src/test/java/Features/FacebookLogin.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "use validate Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookStepDef.use_validate_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
});