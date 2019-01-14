<!DOCTYPE html>
<html lang="en">
   <head>
      <title>Executive Summary Report</title>
      <meta charset="utf-8"/>
      <meta name="viewport" content="width=device-width, initial-scale=1"/>
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <style>
           .column {
         margin-right:-25px;
         float: right;
         
         padding: 10px;
         color: black;
         }
         
         .specialRow {
         color: green;
         }
         .container-fluid {
         margin-top: 10px;
         }
         table{
         border: 1px solid #cebfbf;
         }
         tr:nth-child(even) {
         background-color: #dddddd;
         }
         tr td{
         text-align:left;
         }
         
         .columnHeader,.dataAlign{
         text-align:center;
         }
         .footer-bottom {
         position: fixed;
         height: 50px;
         bottom: 0;
         width: 100%;
         padding: 10px 0 0px;
         border-top: 1px solid #666;
         background: #1e1e1e;
         }
         .footer {
         position: fixed;
         left: 0;
         bottom: 0;
         width: 100%;
         background-color: #eee;
         color: black;
         text-align: center;
         }
         ${cssSummary}
      </style>
   </head>
   <body>
   
            <div>Started at: ${startTime?datetime}</div>
            <div>Ended at : ${endTimeftl?datetime}</div>
            <div style="text-align:center;font-size: large;font-weight: 800;">${projectName}</div>
            <div style="color: black;">Total time taken ${executionTime}</div>
         
   
     <div id="list">
         <div class="container-fluid">
            <div class="row">
               <div class="col-sm-12" >
                  <div class="table-responsive">
                     <table class="table" style="width:100%" cellpadding="5">
                        <caption style="margin-top: -10px;color:black;text-align:center;font-weight:bolder;font-size:18px;background-color:white;border:0">Executive Summary Report</caption>
                        <thead>
                           <tr style="background-color:#6b7ae0;color:white;">
                              <th class="columnHeader" colspan="4">Suites</th>
                              <th class="columnHeader" colspan="4">Scenarios</th>
                              <th class="columnHeader" colspan="5">Test Cases</th>
                           </tr>
                           <tr style="background-color:#f8f7ff">
                              <th class="dataAlign">Name</th>
                              <th class="dataAlign">Release</th>
                              <th class="dataAlign">Channel</th>
                              <th class="dataAlign">Browser</th>
                              <th class="dataAlign">Passed</th>
                              <th class="dataAlign">Failed</th>
                              <th class="dataAlign">Skipped</th>
                              <th class="dataAlign">Total</th>
                              <th class="dataAlign">Passed</th>
                              <th class="dataAlign">Failed</th>
                              <th class="dataAlign">Skipped</th>
                              <th class="dataAlign">Total</th>
                              <th class="dataAlign">Execution</th>
                           </tr>
                        </thead>
                        <#list systems as system>
                        <#assign passCount=system.scenarioCount-system.scenarioFailedCount>
                        <#assign testPassPercentage = system.passPercentage />
                        <#assign testPassNumberasString=testPassPercentage?replace("%","")>
                        <#assign testPassNumber = testPassNumberasString?number>
                        <#if testPassNumber gt passPercentageThreshold >
                        <#assign resultColor='color_pass'>
                        <#elseif testPassNumber lt failPercentageThreshold>
                        <#assign resultColor='color_fail'>
                        <#else>
                        <#assign resultColor='color_amber'>
                        </#if>
                        <tbody>
                           <#if resultColor?contains("pass")>               
                           <tr style="background-color:#ebffeb">
                              <#else>
                           <tr style="background-color:#ffe0e0">
                              </#if>  
                              <td class="${resultColor} dataAlign"><span style="color:white">${system.testSuite}</span></td>
                              <td class="dataAlign">${system.release}</td>
                              <td class="dataAlign">${system.channel}</td>
                              <#if system.browser=="">
                              <td class="dataAlign">NA</td>
                              <#else>
                              <td class="dataAlign">${system.browser}</td>
                              </#if>
                              <#if passCount gt 0>
                              <#assign passPercentage=system.scenarioPassPercentage>
                              <td class="result_pass dataAlign bandwidth" style="text-align:center">${passCount} [${passPercentage}]</td>
                              </#if>
                              <#if passCount lte 0>
                              <td class="dataAlign">${passCount}</td>
                              </#if>
                              <#if system.scenarioFailedCount gt 0>
                              <#assign failPercentage=system.scenarioFailPercentage>
                              <td class="result_fail dataAlign bandwidth" style="text-align:center">${system.scenarioFailedCount} [${failPercentage}]</td>
                              </#if>
                              <#if system.scenarioFailedCount lte 0>
                              <td class="dataAlign">${system.scenarioFailedCount}</td>
                              </#if>
                              
                              <#if system.scenarioSkipCount gt 0>
                              <#assign skipPercentage=system.scenarioSkipPercentage>
                              <td class="dataAlign bandwidth" style="text-align:center">${system.scenarioSkipCount} [${skipPercentage}]</td>
                              <#else>
                              <td class="dataAlign">${system.scenarioSkipCount}</td>
                              </#if>
                              <td class="dataAlign">${system.scenarioCount}</td>
                              <#if system.passedCount gt 0>
                              <#assign passCountPercentage=system.passPercentage>
                              <td class="result_pass dataAlign bandwidth" style="text-align:center">${system.passedCount} [${passCountPercentage}]</td>
                              </#if>
                              <#if system.passedCount lte 0>
                              <td class="dataAlign">${system.passedCount}</td>
                              </#if>
                              <#if system.failedCount gt 0>
                              <#assign failCountPercentage=system.failPercentage>
                              <td class="result_fail dataAlign bandwidth" style="text-align:center">${system.failedCount} [${failCountPercentage}]</td>
                              </#if>
                              <#if system.failedCount lte 0>
                              <td class="dataAlign">${system.failedCount}</td>
                              </#if>
                              <td class="dataAlign">${system.noRunCount}</td>
                              <td class="dataAlign">${system.testcaseCount}</td>
                              <td class="dataAlign">${system.executionPercentage}</td>
                           </tr>
                        </tbody>
                        </#list>
                     </table>
                     
                  </div>
               </div>
            </div>
         </div>
      </div>
      <#-- 
      <#if overallPassRateftl??>	
      <#if overallPassRateftl gte passPercentageThreshold >
      <#assign result='result_pass'>
      <#elseif overallPassRateftl lte failPercentageThreshold >
      <#assign result='result_fail'>
      <#else>
      <#assign result='result_amber'>
      </#if>
      </#if>
       <div class="footer-bottom ${result}">
         <div class="col-sm-4 ">
            <#if result=='result_pass'>
            <span style="float:left;font-size:22px;">Execution Successful!!!</span>
            <#elseif result=='result_fail'>
            <span style="float:left;font-size:22px;">FAILED!!</span>
            <#else>
            <span style="float:left;font-size:22px;">Warning!!</span>
            </#if>
         </div>
         <div class="col-sm-4 "></div>
         <div class="col-sm-4 ">
            <span style="font-size:22px; float:right">OverAll Pass Rate :${overallPassRateftl?string["0.##"]}%</span>
         </div>
        
      </div>
       -->   
         
     
   </body>
</html>