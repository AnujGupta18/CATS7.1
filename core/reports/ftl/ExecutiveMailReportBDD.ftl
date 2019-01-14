<html lang="en">
   <head>
      <title>Executive Summary Report</title>
      <meta charset="utf-8">
       
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <style>
      	 .bandwidth{
      		width:8%;
      	 }
         
     	 th.dataAlign{
     	 color:cadetblue;
     	 }
         .duration {
         color: black;
         }
         div span {
         font-size: 18px;
         float: left;
         }
         .center {
         text-align: center;
         color: white;
         margin-top: 10px;
         }
         
         tr:hover {
         background-color: #ddd;
         }
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
         
     ${cssSummary}         
      </style>
   </head>
   <body>
            <div>Started at: ${startTime?datetime}</div>
            <div>Ended at :  ${endTime?datetime}</div>
            <div style="text-align:center;font-size: large;font-weight: 800;">${catsprojectName}</div>
            <div class="duration">Total time taken ${totalDuration}</p>
      
      <#assign overAllPassPercentage=0>
      <#assign overAllFailPercentage=0>
      <#assign overAllTotalPercentage=0>
      <#assign overallExecutionRate=0>
      <#assign count=0>
      <div id="list">
         <div class="container-fluid">
            <div class="row">
               <div class="col-sm-12">
                  <div class="table-responsive">
                     <table class="table" style="width:100%" cellpadding="5">
                        <caption style="margin-top: -10px;color:black;text-align:center;font-weight:bolder;font-size:18px;background-color:white;border:0">Executive Summary Report</caption>
                        <thead>
                           <tr style="background-color:#6b7ae0;color:white;">
                              <th class="columnHeader" colspan="4">Suites</th>
                              <th class="columnHeader" colspan="4">Scenarios</th>
                              <th class="columnHeader" colspan="7">Gherkin Steps</th>
                           </tr>
                           <tr style="background-color:#f8f7ff">
                              <th class="dataAlign">Name</th>
                              <th class="dataAlign">Release</th>
                              <th class="dataAlign">Channel</th>
                              <th class="dataAlign">Browser</th>
                              <th class="dataAlign">Passed</th>
                              <th class="dataAlign">Failed</th>
                              <th class="dataAlign">Partially Skipped</th>
                              <th class="dataAlign">Total</th>
                              <th class="dataAlign">Passed</th>
                              <th class="dataAlign">Failed</th>
                              <th class="dataAlign">Partially Skipped</th>
                              <th class="dataAlign">Skipped</th>
                              <th class="dataAlign">Total</th>
                              <th class="dataAlign">Execution [%]</th>
                              <th class="dataAlign">Duration</th>
                           </tr>
                        </thead>
                       
                        <tbody>
                        <#list overAllReport as bddReportOutcome>
                        <#assign overAllPassCountScenario=0>
            			<#assign overAllFailCountScenario=0>
            			<#assign overAllPartiallySkipCountScenario=0>	
            			<#assign totalScenario=0>	
            			
            			<#assign stepdefPassCount=0>
			         	<#assign stepdefFailCount=0>
			         	<#assign stepdefSkipCount=0>
            			<#assign stepdefPartiallySkippedCount=0>
            			<#assign totalSteps=0>	
            			
            			<#assign resultColor="">
            			
                        <#list bddReportOutcome as reportforScenario>
			            <#if reportforScenario.stepsCount==1>
			            
			            <#if reportforScenario.bddDefExecutionInstance.status=='PASS'>
			            <#assign overAllPassCountScenario=overAllPassCountScenario+1>
			            <#elseif reportforScenario.bddDefExecutionInstance.status=='FAIL'>
			            <#assign overAllFailCountScenario=overAllFailCountScenario+1>
			            <#elseif reportforScenario.bddDefExecutionInstance.status=='PARTIALLY SKIPPED'>
			            <#assign overAllPartiallySkipCountScenario=overAllPartiallySkipCountScenario+1>
			            </#if>
			            
			            </#if>
            			
            			<#if reportforScenario.scenarioStatus=='FAIL'>
		                  <#assign stepdefFailCount=stepdefFailCount+1>
		                  <#elseif reportforScenario.scenarioStatus=='UNDEFINED'>
		                  <#assign stepdefPartiallySkippedCount=stepdefPartiallySkippedCount+1>
		                  <#elseif reportforScenario.scenarioStatus=='SKIPPED'>
		                  <#assign stepdefSkipCount=stepdefSkipCount+1>
		                  <#else>
		                  <#assign stepdefPassCount=stepdefPassCount+1>		   
		                </#if>
		            
			            </#list>
			            
			            <#assign exceutiveReportBasedOn = EXECUTIVE_OVERALL_PASS_PERCENTAGE_BASED_ON?lower_case>
			            <#assign testStepFailCount=0>
			            <#assign testStepPassCount=0>
			            <#list bddReportOutcome as reportGraph>
			            <#assign flagForFail="false">
			            <#assign flagForPass="false">
			            <#list reportGraph.testStepInstanceNew as testStepsValue>
			            <#if testStepsValue.state??>
			            <#if testStepsValue.state=='FAILED' || testStepsValue.state=='SKIPPED'>
			            <#assign testStepFailCount=testStepFailCount+1>
			            <#assign flagForFail="true">
			            <#elseif testStepsValue.state=='TC TERMINATED' || testStepsValue.state=='SCN TERMINATED' || testStepsValue.state=='SUITE TERMINATED' >
			            <#assign testStepFailCount=testStepFailCount+1>
			            <#assign flagForFail="true">
			            <#elseif testStepsValue.state=='PASSED' >
			            <#assign testStepPassCount=testStepPassCount+1>
			            <#assign flagForPass="true">
			            </#if>
			            </#if>
			            </#list>
			            <#-- Added for making failed scenario to have atleast one failed action starts here 
			            <#if flagForFail=='false' && reportGraph.scenarioStatus=='FAIL'>
			            <#assign testStepFailCount=testStepFailCount+1>
			            </#if>-->
			            <#-- ends here -->
			            <#-- Added for making passed scenario to have atleast one passed action starts here -->
			            <#if flagForPass=='false' && reportGraph.scenarioStatus=='PASS' && reportGraph.testStepInstanceNew?size gt 0>
			            <#assign testStepPassCount=testStepPassCount+1>
			            </#if>
			            <#-- ends here -->
			            </#list>
			            
			            <#assign totalSteps=stepdefPassCount+stepdefFailCount+stepdefPartiallySkippedCount+stepdefSkipCount>	
			            <#assign totalScenario=overAllPassCountScenario+overAllFailCountScenario+overAllPartiallySkipCountScenario>
			            
			            
			            <#if exceutiveReportBasedOn=='testcase'>
			            <#assign overAllPassPercentage=overAllPassPercentage+stepdefPassCount>
			            <#assign overAllFailPercentage=overAllFailPercentage+stepdefFailCount>
			            <#assign overAllTotalPercentage=overAllTotalPercentage+totalSteps>
			            <#else>
			            <#assign overAllPassPercentage=overAllPassPercentage+testStepPassCount>
			            <#assign overAllFailPercentage=overAllFailPercentage+testStepFailCount>
			            <#assign overAllTotalPercentage=overAllTotalPercentage+testStepPassCount+testStepFailCount>
      					</#if>
			            
			            <#if overAllFailCountScenario gt 0>
			            <#assign resultColor="color_fail">
            			<#elseif overAllPassCountScenario==totalScenario>
            			<#assign resultColor="color_pass">
            			<#else>
            			<#assign resultColor="color_amber">
			            </#if>
			            
			            <#if resultColor?contains("pass")>
			            <tr style="background-color:#ebffeb">
			            <#elseif resultColor?contains("fail")>
			            <tr style="background-color:#ffe0e0">
			            <#else>
			            <tr style="background-color:#FFB850">
			            </#if>
			            <#list bddReportOutcome as reportforScenario>
			            <#if reportforScenario_index==0>
			            <td class="${resultColor} dataAlign">
			           	<span style="color:white">${reportforScenario.suiteName}</span>
                         </td>
                         <td class="dataAlign">
                         ${reportforScenario.release}
                         </td> 
                         <td class="dataAlign">
                         ${reportforScenario.channel}
                         </td>
                         <td class="dataAlign">
                         ${reportforScenario.browser}
                         </td> 
                         </#if>
                         </#list> 
                         <#if overAllPassCountScenario gt 0>
                         <td class="result_pass dataAlign bandwidth" style="text-align:center">
                         <#else>
                         <td class="dataAlign">
                         </#if>
                         <#assign passPercentage=overAllPassCountScenario/totalScenario*100>
                         ${overAllPassCountScenario} [${passPercentage?string["0.##"]}%]
                         </td>
                          
                         <#if overAllFailCountScenario gt 0>
                         <td class="result_fail dataAlign bandwidth" style="text-align:center">
                         <#else>
                         <td class="dataAlign">
                         </#if>
                         <#assign failPercentage=overAllFailCountScenario/totalScenario*100>
                         ${overAllFailCountScenario} [${failPercentage?string["0.##"]}%]
                         </td> 
                         
                         
                         <td class="dataAlign bandwidth" style="text-align:center">
                         <#assign partialPercentage=overAllPartiallySkipCountScenario/totalScenario*100>
                         ${overAllPartiallySkipCountScenario} [${partialPercentage?string["0.##"]}%]
                         </td> 
                         <td class="dataAlign">
                         ${totalScenario}
                         </td> 	
                         
                         
                         <#if stepdefPassCount gt 0>
                         <td class="result_pass dataAlign bandwidth" style="text-align:center">
                         <#else>
                         <td class="dataAlign">
                         </#if>
                         <#assign stepPass=stepdefPassCount/totalSteps*100>
                         ${stepdefPassCount} [${stepPass?string["0.##"]}%]
                         </td>
                         <#if stepdefFailCount gt 0>
                         <td class="result_fail dataAlign bandwidth" style="text-align:center">
                         <#else>
                         <td class="dataAlign">
                         </#if>
                         <#assign stepFail=stepdefFailCount/totalSteps*100>
                         ${stepdefFailCount} [${stepFail?string["0.##"]}%]
                         </td>
                         <#assign stepPartial=stepdefPartiallySkippedCount/totalSteps*100>
                         <td class="dataAlign bandwidth" style="text-align:center">${stepdefPartiallySkippedCount} [${stepPartial?string["0.##"]}%]</td>
                         <#assign stepSkip=stepdefSkipCount/totalSteps*100>
                         <td class="dataAlign bandwidth" style="text-align:center">${stepdefSkipCount} [${stepSkip?string["0.##"]}%]</td>
                         <td class="dataAlign">${totalSteps}</td>
                         
                         <#assign execution=(stepdefPassCount+stepdefFailCount)/totalSteps>
                         <#assign overallExecutionRate=overallExecutionRate+execution>
                         <#assign count=count+1>
                         <#assign execution=execution*100>
                         <td class="dataAlign bandwidth">${execution?string["0.##"]}</td>
                         <#list bddReportOutcome as reportforScenario>
			            <#if reportforScenario_index==0>
			            <#assign durationHours=reportforScenario.duration?replace(" Hours ", ":")>
			            <#assign durationMins=durationHours?replace(" Mins ", ":")>
			            <#assign durationOverall=durationMins?replace(" Secs", "")>
			            <#assign timeTaken="">
			            <#assign sizeDuration=durationOverall?split(":")?size>
			            <#list durationOverall?split(":") as x>
						<#if x?number gt 9>
						<#assign timeTaken=timeTaken+x>
						<#else>
						<#assign timeTaken=timeTaken+"0"+x>
						</#if>
						<#if x_index gt -1 && x_index!=sizeDuration-1>
						<#assign timeTaken=timeTaken+":">
						</#if>
						</#list>
                         <td class="dataAlign">${timeTaken}</td>
                         </#if>
                         </#list>
                        </tr>
                        </#list>
                        </tbody>
                     </table>
                     
                  </div>
               </div>
            </div>
         </div>
      </div>
       
        
   </body>
</html>