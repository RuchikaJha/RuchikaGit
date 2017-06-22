$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Conversion.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 3,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 4,
      "value": "#| (Data Tables)"
    },
    {
      "line": 5,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 6,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 7,
      "value": "#\"\""
    }
  ],
  "line": 9,
  "name": "Convert between different unit of temperatures",
  "description": "I want to use this template for my feature file\r\n\r\nFormula: C/5 \u003d (F-32)/9\r\nC \u003d 5(F-32)/9 \u003d 5(98.6 - 32 \u003d)/9 \u003d 37",
  "id": "convert-between-different-unit-of-temperatures",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 15,
  "name": "Convert to Celcius from Farenhiet",
  "description": "",
  "id": "convert-between-different-unit-of-temperatures;convert-to-celcius-from-farenhiet",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I want to convert 98.6 Farenhiet into Celcius",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I input the value of Farenhiet into text",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "It should be converted to Celcius as 37 degree",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});