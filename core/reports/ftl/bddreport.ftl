
<html lang="en">
   <head>
      <title>Detailed Report</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/es6-shim/0.34.1/es6-shim.js"></script>
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
      <style>
         .dataAlign{
         //text-align:center;
         }
         #errorMessage{
         text-align:center;
         color:red;
         font-size: medium;
         font-weight: 600;
         }
         .switch,.switchGraph {
		  position: relative;
		  display: inline-block;
		  width: 90px;
		  float:right;
		  height: 34px;
		}
		.switchGraph input {display:none;}
		.switch input {display:none;}
		
		.slider {
		  position: absolute;
		  cursor: pointer;
		  top: 0;
		  left: 0;
		  right: 0;
		  bottom: 0;
		  background-color: #58b4a8;
		  -webkit-transition: 0.7s;
		  transition: 0.7s;
		}

		.slider:before {
		  position: absolute;
		  content: "";
		  height: 26px;
		  width: 26px;
		  left: 4px;
		  bottom: 4px;
		  background-color: #ec9f9f;
		  -webkit-transition: 0.7s;
		  transition: 0.7s;
		}

		input:checked + .slider {
		  background-color: #666666;
		}

		input:focus + .slider {
		  box-shadow: 0 0 1px #2196F3;
		}

		input:checked + .slider:before {
		  -webkit-transform: translateX(55px);
		  -ms-transform: translateX(55px);
		  transform: translateX(55px);
		}

		/*------ ADDED CSS ---------*/
		.on,.onGraph
		{
		  display: none;
		}

		.on
		{
		  color: white;
		  position: absolute;
		  transform: translate(-50%,-50%);
		  top: 50%;
		  left: 33%;
		  font-size: 9px;
		  font-family: Verdana, sans-serif;
		}
		#HideG{
		  color: white;
		  position: absolute;
		  transform: translate(-50%,-50%);
		  top: 50%;
		  left: 50%;
		  font-size: 9px;
		  font-family: Verdana, sans-serif;
		}
		#ShowG
		{
		  color: white;
		  position: absolute;
		  transform: translate(-50%,-50%);
		  top: 50%;
		  left: 65%;
		  font-size: 9px;
		  font-family: Verdana, sans-serif;
		}
		.off{
		  color: white;
		  position: absolute;
		  transform: translate(-50%,-50%);
		  top: 50%;
		  left: 55%;
		  font-size: 9px;
		  font-family: Verdana, sans-serif;
		}
		input:checked+ .slider .on
		{display: block;}

		input:checked + .slider .off
		{display: none;}

		/*--------- END --------*/

		/* Rounded sliders */
		.slider.round {
		  border-radius: 34px;
		}

		.slider.round:before {
		  border-radius: 50%;}
		
		#myInput{
         float: right;
         }
         .tagNameStyle{
         color:red;
         }
         .myRow{
         width:99%;
         margin-left:5px;
         margin-right:0px;
         }
         #myBtn {
         opacity:0.5;
         display: none;
         position: fixed;
         bottom: 20px;
         right: 30px;
         z-index: 99;
         font-size: 18px;
         border: none;
         outline: none;
         background-color: #5564fd;
         color: white;
         cursor: pointer;
         padding: 10px;
         border-radius: 15px;
         }
         #myBtn:hover {
         opacity:1;
         background-color: #555;
         }
         .titleOverallGraph{
         text-align:center;
         font-family:arial;
         }
         .colorbg{
         background-color:#ffe1e7;
         }
         .colorbg2{
         text-align: -webkit-center;
         text-align: -moz-center;
         background-color:#e2edff;
         }
         .lipassnograph{
         float:left;
         font-size:12px;
         }
         .lipassnograph::before{ 
         content: ' \25CF';
         color:#006600;
         vertical-align: sub;
         font-size: 240%;
         padding-right: 3px;
         }
         .lifailnograph{
         float:left;
         font-size:12px;
         }
         .lifailnograph::before{ 
         content: ' \25CF';
         color:#FF0000;
         vertical-align: sub;
         font-size: 240%;
         padding-right: 3px;
         }
         .lipartiallyskipnograph{
         float:left;
         word-break: break-all;
         font-size:12px;
         }
         .lipartiallyskipnograph::before{ 
         content: ' \25CF';
         color:#FFB850;
         vertical-align: sub;
         font-size: 240%;
         padding-right: 3px;
         }
         .liskipnograph{
         float:left;
         font-size:12px;
         }
         .liskipnograph::before{ 
         content: ' \25CF';
         color:#56aff1;
         vertical-align: sub;
         font-size: 240%;
         padding-right: 3px;
         }
        #graph{
         float: right;
         margin-right: 10px;
         margin-top:-20px;
         cursor:pointer;
         font-size:12px;
         }
        
         .graph1{
         float:left;
         font-family:arial;
         margin-top: 15px;
         border-right:0px;
         list-style-type:none;
         padding-left:30px;
         padding-top:2px;
         line-height:130%
         }
         .graph2{
         float:left;
         font-family:arial;
         margin-top: 15px;
         border-right:0px;
         list-style-type:none;
         padding-left:30px;
         padding-top:2px;
         line-height:130%
         }
         .lipass{
         float:left;
         font-size:12px;
         }
         .lipass::before{ 
         content: ' \25CF';
         color:#006600;
         vertical-align: sub;
         font-size: 240%;
         padding-right: 3px;
         }
         .lifail{
         float:left;
         font-size:12px;
         }
         .lifail::before{ 
         content: ' \25CF';
         color:#FF0000;
         vertical-align: sub;
         font-size: 240%;
         padding-right: 3px;
         }
         .lipartiallyskip{
         float:left;
         word-break: break-all;
         font-size:12px;
         }
         .lipartiallyskip::before{ 
         content: ' \25CF';
         color:#FFB850;
         vertical-align: sub;
         font-size: 240%;
         padding-right: 3px;
         }
         .liskip{
         float:left;
         font-size:12px;
         }
         .liskip::before{ 
         content: ' \25CF';
         color:#56aff1;
         vertical-align: sub;
         font-size: 240%;
         padding-right: 3px;
         }
         svg > g > g:last-child { pointer-events: none }
         tr.noBorder td {
         border: 0;
         }
         #status{
         float:right;
         }
         .item{
         color:white;
         text-align: left;
         font-size: 15px;
         /* border: 0px solid blue; */
         background-color: black;
         padding: 10px;
         }
         .duration {
         color: black;
         }
         table {
         font-family: arial, sans-serif;
         border-collapse: collapse;
         table-layout: fixed;
         width: 99%;
         margin-top: 15px;
         margin-bottom: 25px;
         margin-left: 10px;
         }
         td {
         font-size: 14px;
         }
         td, th {
         border: 1px solid #dddddd;
         text-align: left;
         padding: 3px;
         word-wrap: break-word;
         font-family: initial;
         }
         .FAILED {
         color: red;
         }
         td[class$="CONDITION"] {
         color: #FFC200;
         }
         .PASSED {
         color: green;
         }
         td[class$="pass"] {
         color: green;
         }
         td[class$="fail"] {
         color: red;
         }
         .header img {
         margin-top:-10px;
         margin-left: -10px;
         float: left;
         background: #555;
         min-width:250px;
         min-height:80px;
         }
         .header h1 {
         position: relative;
         top: 18px;
         }
         .column {
         margin-right:-3px;
         float: right;
         padding: 10px;
         color: black;
         }
         .center {
         text-align: center;
         color: white;
         }
         .footer-bottom {
         position: fixed;
         bottom: 0;
         width: 100%;
         border-top: 1px solid #666;
         background: #1e1e1e;
         }
         .projTitle {
         width: 90%;
         text-align: center;
         }
         button{
         float:right;
         }
         .fa-seperator:before{
		  content:"\002F";
		  }
         #seperator{
         font-weight:bolder;
         }
         #addminus,#addplus{
         border: 2px solid dodgerblue;
         border-radius: 6px;
         float: right;
         margin-right: 15px;
         margin-bottom: -10px;
         cursor:pointer;
         }
         #tickPass{
         color:green;
         font-size:16px;
         margin:5px;
         }
         #tickFail{
         color:red;
         font-size:16px;
         margin:5px;
         }
         .table-responsive {
         min-height: .01%;
         overflow-x: unset;
         }
         #option{
         float: right;
         margin: -20px 5px 0 0;
         text-decoration: underline;
         color: crimson;
         cursor:pointer;
         }
         
         ${cssDetailed}
         h2{
         text-align:center;
         }
      </style>
   </head>
   <body>
      <script>
         $(document).ready(function(){
         
         
         $("#graphTable").show();
         
         $('.switch-Graphinput').on('change', function () {
         var isChecked = $(this).is(':checked');
         if (isChecked) {
		
         $(".graphTable").show();
         
         }
         else{
         
         $(".graphTable").hide();
         }
         });
         function setSwitchState(el, flag) {
         el.attr('checked', flag);
         }
         setSwitchState($('.switch-Graphinput'), true);


         
         
         sayswho= (function(){
			var ua= navigator.userAgent, tem,
			M= ua.match(/(opera|chrome|safari|firefox|msie|trident(?=\/))\/?\s*(\d+)/i) || [];
			if(/trident/i.test(M[1])){
				tem=  /\brv[ :]+(\d+)/g.exec(ua) || [];
				return 'IE '+(tem[1] || '');
			}
			if(M[1]=== 'Chrome'){
				tem= ua.match(/\b(OPR|Edge)\/(\d+)/);
				if(tem!= null) return tem.slice(1).join(' ').replace('OPR', 'Opera');
			}
			M= M[2]? [M[1], M[2]]: [navigator.appName, navigator.appVersion, '-?'];
			if((tem= ua.match(/version\/(\d+)/i))!= null) M.splice(1, 1, tem[1]);
			return M.join(' ');
		})();
		 //alert(sayswho);
		 if (sayswho.indexOf("IE") != -1) {
		 //alert("true");
			document.getElementById("customFail").style.marginLeft="-60px";
			document.getElementById("customFail").style.marginTop="3px";
		}
		else{
		//alert("false");
		}
         
         try{
         var type=window.location.href;
         
         if(type.includes("boxVType")){
         
         if (typeof(Storage) !== "undefined") {
         // Store
         localStorage.setItem("viewtype", "box");
         
         } else {
         alert( "Sorry, your browser does not support Web Storage...");
         }
         }
         else if(type.includes("listVType")){
         
         if (typeof(Storage) !== "undefined") {
         // Store
         localStorage.setItem("viewtype", "list");
         
         } else {
         alert( "Sorry, your browser does not support Web Storage...");
         }
         }
         }
         catch(e){}
         
           
           $(".link").click(function(e){
         	e.preventDefault();
         	var url = $(this).attr("href");
         	$("#myModal iframe").attr("src", url);
           });
         $("#addminus").click(function(e){
          $(".steps").css('visibility', 'collapse');
          });
          
          $("#addplus").click(function(e){
          
          var specialClassinbutton=document.getElementsByClassName("steps");
         
         for (n = 0; n < specialClassinbutton.length; n++) {
         if(specialClassinbutton[n].parentNode.parentNode.style.display==="block"){
         specialClassinbutton[n].style.visibility = "visible";
         }
         else{
         specialClassinbutton[n].style.visibility = "inherit";
         }
         }
          
          
          });
         });
         function TestFunction(param,count) {
         for (i = 0; i < count; i++) {
         var x = document.getElementById(param+i);
         if(x.style.visibility=='collapse'){
         x.style.visibility='visible';
         }
         else{
         x.style.visibility='collapse';
         }
         }
         }
         
           
      </script>
      <div class="row myRow">
         <div class="column">
         <div>Started at: ${individualStartDate?datetime}</div>
            <div>Ended at : ${individualEndDate?datetime}</div>
            
            <p class="duration">Total time taken: ${timeTaken}</p>
         </div>
         <div class="header">
            <img src="data:image/jpeg;base64,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" alt="cats logo" width="15%" height="10%" />
            <div class="projTitle">
               <h1>${catsprojectName}</h1>
               
            </div>
            <h4 id="option" style="display:none">Tag Details</h4>
         </div>
         
      </div>
      <#if stepmap?size !=0>
               <label class="switch" style="margin-top:-20px;margin-right: 5px;">
				<input class="switch-input" type="checkbox" id="togBtn">
				<div class="slider round">
				<span class="on">SCENARIO</span>
				<span class="off">TAG</span>
				</div>
	 		 </label>
               </#if>
      <div class="modal fade" id="myModal" role="dialog" tabindex='-1' aria-hidden="true" data-backdrop="static" data-keyboard="true">
         <div class="modal-dialog" style="width:80%; height:80%">
            <!-- Modal content-->
            <div class="modal-content">
               <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Link Content</h4>
               </div>
               <div class="modal-body">
                  <iframe width="100%" height="500" style="overflow: hidden;"  frameborder="0" marginheight="0" marginwidth="0" scrolling="yes">Loading&amp;#8230;</iframe>
               </div>
            </div>
         </div>
      </div>
      
      <#if graphParam=='no'>
      <#else>
      
      <label id="graph" class="switchGraph">
		<input class="switch-Graphinput" type="checkbox" id="togBtn">
		<div class="slider round">
		<span class="on" id="HideG">Hide Graph</span>
		<span class="off" id="ShowG">Show Graph</span>
		</div>
	 </label>
	 <div>
      <table class="graphTable">
         <tr class="noBorder">
            <#if errorCodes?size != 0>
            <td width="3%" class="colorbg2">
               <ul class="graph1">
                  <li class="lipass">Passed</li>
                  <br/>
                  <li class="lifail" id="customFail">Failed</li>
                  <br/>
                  <li class="lipartiallyskip">Partially Skipped</li>
                  <br/>
                  <li class="liskip">Skipped</li>
               </ul>
            </td>
            <#else>
            <td width="2%" class="colorbg2">
               <ul class="graph2">
                  <li class="lipassnograph">Passed</li>
                  <br/>
                  <li class="lifailnograph" id="customFail">Failed</li>
                  <br/>
                  <li class="lipartiallyskipnograph">Partially Skipped</li>
                  <br/>
                  <li class="liskipnograph">Skipped</li>
               </ul>
            </td>
            </#if>
            <td width="4%" class="graphTitle colorbg2">
               <h4 class="titleOverallGraph">Feature Scenario</h4>
               <div id="piechart1" ></div>
            </td>
            <td width="4%" class="graphTitle colorbg2">
               <h4 class="titleOverallGraph">Gherkin Steps</h4>
               <div id="piechart2" ></div>
            </td>
            <td width="4%" class="graphTitle colorbg2">
               <h4 class="titleOverallGraph">Actions</h4>
               <div id="piechart3"></div>
            </td>
            <#if errorCodes?size != 0>
            <td width="9%" class="graphTitle colorbg">
               <h4 class="titleOverallGraph">Error Code</h4>
               <div id="piechart4"></div>
            </td>
            </#if>
         </tr>
      </table>
      </div>
      </#if>
      <div>
         <p id="errorMessage"></p>
      </div>
      <#if stepmap?size !=0>
      <div id="TAG">
         <div class="container-fluid">
            <div class="row">
               <div class="col-sm-12">
                  <div class="table-responsive">
                     <div id="search">
                        <input type="search" id="myInput" onkeyup="myFunction('tag');" placeholder="Enter Tag name">
                     </div>
                     <table class="table table-bordered" style="margin-left:auto">
                        <caption class="titleReport" style="margin-top:0px;">Tag Level Report</caption>
                        <thead>
                           <tr style="background-color:#6b7ae0;color:white;">
                              <th class="columnHeader" colspan="5">Steps</th>
                              <th class="columnHeader" colspan="4">Scenario</th>
                              <th class="columnHeader" colspan="1">Feature</th>
                           </tr>
                           <tr style="background-color:#f8f7ff">
                              <th class="dataAlign">Tag</th>
                              <th class="dataAlign">Passed</th>
                              <th class="dataAlign">Failed</th>
                              <th class="dataAlign">Skipped</th>
                              <th class="dataAlign">Partially Skipped</th>
                              <th class="dataAlign">Passed</th>
                              <th class="dataAlign">Failed</th>
                              <th class="dataAlign">Skipped</th>
                              <th class="dataAlign">Partially Skipped</th>
                              <th class="dataAlign">Status</th>
                           </tr>
                        </thead>
                        <tbody>
                           <#list stepmap?keys as tagValues> 
                           <tr class="${tagValues}">
                              <td class="tagNameStyle dataAlign">${tagValues}</td>
                              <#list stepmap[tagValues]?keys as statusValues> 
                              <#if statusValues=='APASS'>
                              <td class="dataAlign">${stepmap[tagValues][statusValues]}</td>
                              <#elseif statusValues=='BFAIL'>
                              <td class="dataAlign">${stepmap[tagValues][statusValues]}</td>
                              <#elseif statusValues=='SKIPPED'>
                              <td class="dataAlign">${stepmap[tagValues][statusValues]}</td>
                              <#elseif statusValues=='UNDEFINED'>
                              <td class="dataAlign">${stepmap[tagValues][statusValues]}</td>
                              </#if>
                              </#list>
                              <#list scenariomap?keys as sceValues> 
                              <#if tagValues==sceValues>
                              <#list scenariomap[sceValues]?keys as status> 
                              <#if status=='APASS'>
                              <td class="dataAlign">${scenariomap[sceValues][status]}</td>
                              <#elseif status=='BFAIL'>
                              <td class="dataAlign">${scenariomap[sceValues][status]}</td>
                              <#elseif status=='SKIPPED'>
                              <td class="dataAlign">${scenariomap[sceValues][status]}</td>
                              <#elseif status=='UNDEFINED'>
                              <td class="dataAlign">${scenariomap[sceValues][status]}</td>
                              </#if>
                              <#if status_index==3>
                              <#break>
                              </#if>
                              </#list>
                              </#if>
                              </#list>
                              <#list featuremap?keys as featureValues> 
                              <#if tagValues==featureValues>
                              <td class="dataAlign">${featuremap[featureValues]}</td>
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
      </#if>
      <div id="SCENARIO">
         <table>
            <#assign overAllPassCountScenario=0>
            <#assign overAllFailCountScenario=0>
            <#assign overAllPartiallySkipCountScenario=0>	
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
            </#list>
            <#assign testCaseFailCount=0>
            <#assign testCaseSkipCount=0>
            <#assign totalTestCases=0>
            <#assign noActionCount=0>
            <#assign skipCountforGraph=0>
            <#list bddReportOutcome as reportGraph>
            <#assign totalTestCases=totalTestCases+1>
            <#assign sizeValue=reportGraph.testStepInstanceNew?size>
            <#if sizeValue==0>
            <#assign noActionCount = noActionCount+1>
            </#if>
            <#list reportGraph.testStepInstanceNew as testStepsValues>
            <#if testStepsValues.state??>
            <#if testStepsValues.state?contains("TERMINATED")>
            <#assign testCaseFailCount=testCaseFailCount+1>
            <#break>
            </#if>
            <#if testStepsValues.state=='FAILED'>
            <#assign testCaseFailCount=testCaseFailCount+1>
            <#break>
            </#if>
            <#if testStepsValues.state=='SKIPPED'>
            <#assign skipCountforGraph=skipCountforGraph+1>
            <#if reportGraph.testStepInstanceNew?size==skipCountforGraph>
            <#assign testCaseSkipCount=testCaseSkipCount+1>
            <#assign skipCountforGraph=0>
            </#if>
            </#if>
            </#if>
            </#list> 
            </#list>
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
            <#assign count=0>
            <#list bddReportOutcome as report>
            <#if report_index == 0>
            <#if report.bddDefExecutionInstance.suiteName??>
            <tr>
               <th>FEATUREID</th>
               <th>SCENARIOID</th>
               <th>TOTAL</th>
               <th>PASSED</th>
               <th>FAILED</th>
               <th>SKIPPED</th>
               <th>PARTIALLY SKIPPED</th>
               <th>EXECUTION</th>
            </tr>
            <caption style="margin-top:0px;">DETAILED REPORT FOR ${report.bddDefExecutionInstance.suiteName}</caption>
            </#if>
            </#if>	
            <#if report.stepsCount==1>
            <#assign TotalCount=0>
            <#assign PassCount=0>
            <#assign FailCount=0>
            <#assign SkipCount=0>
            <#assign PartiallySkipCount=0>
            <#list bddReportOutcome as report1>
            <#if count lte report1_index>
            <#if report1.stepsCount gt TotalCount>
            <#if report1.scenarioStatus??>
            <#if report1.scenarioStatus=='FAIL'>
            <#assign FailCount=FailCount+1>
            <#elseif report1.scenarioStatus=='PASS'>
            <#assign PassCount=PassCount+1>
            <#elseif report1.scenarioStatus=='SKIPPED'>
            <#assign SkipCount=SkipCount+1>
            <#elseif report1.scenarioStatus=='UNDEFINED'>
            <#assign PartiallySkipCount=PartiallySkipCount+1>
            </#if>
            </#if>
            <#assign TotalCount=report1.stepsCount>
            <#assign count=report1_index+1>
            <#else>
            <#assign count=report1_index>
            <#break>
            </#if>
            </#if>
            </#list>
            <tr>
               <td class="dataAlign">
                  ${report.bddDefExecutionInstance.featureId}
               </td>
               <td class="dataAlign">
                  <a href="#${report.bddDefExecutionInstance.scenarioId}_${report.bddDefExecutionInstance.id}">${report.bddDefExecutionInstance.scenarioId}</a>
               </td>
               <td class="dataAlign">
                  ${TotalCount}
               </td>
               <td class="dataAlign">
               <#if PassCount gt 0>
               <#assign passPercentage=PassCount/TotalCount*100>
                  <p style="color:green">${PassCount} [${passPercentage?string["0.##"]}%]</p>
                <#else>
                ${PassCount}
                </#if>  
               </td>
               <td class="dataAlign">
               <#if FailCount gt 0>
               <#assign failPercentage=FailCount/TotalCount*100>
                  <p style="color:red">${FailCount} [${failPercentage?string["0.##"]}%]</p>
               <#else>
               	  ${FailCount}
               </#if>   
               </td>
               <td class="dataAlign">
                  <#if SkipCount gt 0>
                  <#assign skipPercentage=SkipCount/TotalCount*100>
                  ${SkipCount} [${skipPercentage?string["0.##"]}%]
                  <#else>
                  ${SkipCount}
                  </#if>   
               </td>
               <td class="dataAlign">
                  <#if PartiallySkipCount gt 0>
                  <#assign partialPercentage=PartiallySkipCount/TotalCount*100>
                  ${PartiallySkipCount} [${partialPercentage?string["0.##"]}%]
                  <#else>
                  ${PartiallySkipCount}
                  </#if>   
               </td>
               <td class="dataAlign">
                  <#if SkipCount==0 && PartiallySkipCount==0>
                  100%
                  <#else>
                  <#assign execution=PassCount+FailCount>
                  <#assign execution=execution/TotalCount*100>
                  ${execution?string["0.##"]}%
                  </#if>
                  
               </td>
            </tr>
            </#if>
            </#list>
         </table>
      </div>
       <i id="addminus" class="fa fa-minus"></i>
      
      <i id="addplus" class="fa fa-plus"></i>
      <div id="detailTable">
         <#assign stepdefPassCount=0>
         <#assign stepdefFailCount=0>
         <#assign stepdefSkipCount=0>
         <#assign stepdefPartiallySkippedCount=0>
         <#list bddReportOutcome as report>
         <#if report.bddDefExecutionInstance.scenarioId??>
         <#if report.stepsCount==1>
         <#if report_index!=0>
         </tbody>
         </table>
         </#if>
         <#if report.bddDefExecutionInstance.tags!="">
         <#assign nameOfClass=report.bddDefExecutionInstance.tags?replace(",", "_Table ")>
         <#if nameOfClass?contains("_Table")>
         <table class="${nameOfClass}">
         <#else>
         <table class="${nameOfClass}_Table">
         </#if>
         <#else>
         <table class="emptyCatsClass" id="emptyCatsClassId">
         </#if>
         <caption id="${report.bddDefExecutionInstance.scenarioId}_${report.bddDefExecutionInstance.id}" class="item">${report.bddDefExecutionInstance.scenarioId}</caption>
         <tbody class="tbody">
            <tr>
               <th>DESCRIPTION</th>
               <th>CONDITION</th>
               <th>ACTION</th>
               <th>TEST DATA</th>
               <th>EXPECTED RESULT</th>
               <th>ACTUAL RESULT</th>
               <th>STATUS</th>
               <th>ERROR CODE</th>
               <th>OR REFERENCE</th>
               <th>DUR</th>
               <th>SCREEN LINK</th>
            </tr>
            </#if>
            </#if>
            <#assign sizeValue=report.testStepInstanceNew?size>
            <#assign paramValue = report.bddDefExecutionInstance.scenarioId+report.bddDefExecutionInstance.id?string+report.bddDefExecutionInstance.exampleSeq?string+report.stepsCount?string>
            <#if sizeValue??>
            <tr id="testCases${report.scenarioStatus}" onclick="TestFunction('${paramValue}','${sizeValue}')">
               <#else>
            <tr id="testCases${report.scenarioStatus}">
               </#if>
               <th colspan="11">
                  <#if report.casesName?? && report.keyWord??>
                  <span><span style="color:blue">${report.keyWord}</span> ${report.casesName}</span>
                  </#if>
                  <#if report.scenarioStatus=='FAIL'>
                  <span id="status"><span id="tickFail">&#x2716;</span>FAIL</span>
                  <#assign stepdefFailCount=stepdefFailCount+1>
                  <#elseif report.scenarioStatus=='UNDEFINED'>
                  <span id="status">NO ACTIONS</span>
                  <#assign stepdefPartiallySkippedCount=stepdefPartiallySkippedCount+1>
                  <#elseif report.scenarioStatus=='SKIPPED'>
                  <span id="status"><span id="tickFail"></span>SKIP</span>
                  <#assign stepdefSkipCount=stepdefSkipCount+1>
                  <#else>
                  <span id="status"><span id="tickPass">&#x2714;</span>PASS</span>	
                  <#assign stepdefPassCount=stepdefPassCount+1>		   
                  </#if>
               </th>
            </tr>
            <#list report.testStepInstanceNew as testSteps>
            <tr class="steps" id="${paramValue}${testSteps_index}">
               <#if testSteps.description??>
               <td>
                  <p>${testSteps.description?replace("<","&lt;")?replace(">","&gt;")}</p>
               </td>
               <#else>
               <td>
               </td>
               </#if>
               <#if testSteps.controlFlow??>
               <td>
                  <p>${testSteps.controlFlow}</p>
               </td>
               <#else>
               <td>
               </td>
               </#if>
               <#if testSteps.action??>
               <td>
                  <p>${testSteps.action}</p>
               </td>
               <#else>
               <td>
               </td>
               </#if>
               <#if testSteps.testData??>
               <td>
                  <p>${testSteps.testData}</p>
               </td>
               <#else>
               <td>
               </td>
               </#if>
               <#if testSteps.expectedResult??>
               <td>
                  <p>${testSteps.expectedResult?replace("<","&lt;")?replace(">","&gt;")}</p>
               </td>
               <#else>
               <td>
               </td>
               </#if>
               <#if testSteps.actualResult??>
               <td>
                  <p>${testSteps.actualResult?replace("<","&lt;")?replace(">","&gt;")}</p>
               </td>
               <#else>
               <td>
               </td>
               </#if>
               <#if testSteps.state??>
               <#if testSteps.state?contains("CONDITION")>
               <td class="CONDITION">
                  <p>${testSteps.state}</p>
               </td>
               <#else>
               <td class="${testSteps.state}">
                  <p>${testSteps.state}</p>
               </td>
               </#if>
               <#else>
               <td>
               </td>
               </#if>
               <#if testSteps.errorCode??>
               <td>
                  <p>${testSteps.errorCode}</p>
               </td>
               <#else>
               <td>
               </td>
               </#if>
               <#if testSteps.or_name??>
               <td>
                  <p>${testSteps.or_name}</p>
               </td>
               <#else>
               <td>
               </td>
               </#if>
               
               <#if testSteps.duration??>
               <#assign timeValueIs=testSteps.duration?c?number>
               <#assign timeValueIs=timeValueIs/1000>
               <td>
                  <p>${timeValueIs?string["0.##"]}</p>
               </td>
               <#else>
               <td>
               </td>
               </#if>
               <#if testSteps.screenshot??>
               <td>
                  <p><a href="cucumber-html-reports\${testSteps.screenshot}" class="link" data-toggle="modal" data-target="#myModal">Link</a></p>
               </td>
               <#else>
               <td>
               </td>
               </#if>
            </tr>
            </#list>
            </#list>
      </div>
      <div>
      <button onclick="topFunction()" id="myBtn" title="Go to top">TOP</button>
      </div>
      <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
      <script>
         // When the user scrolls down 20px from the top of the document, show the button
         window.onscroll = function() {scrollFunction()};
         function scrollFunction() {
         if (document.body.scrollTop > 500 || document.documentElement.scrollTop > 500) {
             document.getElementById("myBtn").style.display = "block";
         } else {
             document.getElementById("myBtn").style.display = "none";
         }
         }
         // When the user clicks on the button, scroll to the top of the document
         function topFunction() {
         document.body.scrollTop = 0;
         document.documentElement.scrollTop = 0;
         }
            google.charts.load("current", {packages:["corechart"]});
            google.charts.setOnLoadCallback(drawChart);
            function drawChart() {
             var data1 = google.visualization.arrayToDataTable([
                ['Scenario', 'Count'],
                ['PASSED',      ${overAllPassCountScenario}],
                ['FAILED',       ${overAllFailCountScenario}],
                
                ['PARTIALLY SKIPPED',       ${overAllPartiallySkipCountScenario}]
                
              ]);
              var options1 = {
            fontSize:12,
            colors: ['#50BB50', '#ff5050','#FFB850'],
            legend:'none',
            pieHole: 0.5,
            backgroundColor: { fill:'transparent' },
            pieSliceTextStyle: {
               color: 'black',
             },
            'width': 230,
               'height': 230,
            
            chartArea:{left:0,right:10,top:10,bottom:15,width:'90%',height:'95%'}
              };
              var chart1 = new google.visualization.PieChart(document.getElementById('piechart1'));
              chart1.draw(data1, options1);
            var data2 = google.visualization.arrayToDataTable([
                ['TestCases', 'Count'],
                ['PASSED',      ${stepdefPassCount}],
                ['FAILED',       ${stepdefFailCount}],
                ['SKIPPED',       ${stepdefSkipCount}],
                ['PARTIALLY SKIPPED',       ${stepdefPartiallySkippedCount}]
                
              ]);
              var options2 = {
            	fontSize:12,
            colors: ['#50BB50', '#ff5050','#56aff1','#FFB850'],
            legend:'none',
            pieHole: 0.5,
            backgroundColor: { fill:'transparent' },
            pieSliceTextStyle: {
               color: 'black',
             },
            'width':230,
               'height': 230,
            chartArea:{left:0,right:10,top:10,bottom:15,width:'90%',height:'95%'}
               };
              var chart2 = new google.visualization.PieChart(document.getElementById('piechart2'));
              chart2.draw(data2, options2);
            var data3 = google.visualization.arrayToDataTable([
                ['TestSteps', 'Count'],
                ['PASSED',     ${testStepPassCount}],
                ['FAILED',      ${testStepFailCount}]
              ]);
              var options3 = {
            fontSize:12,
            colors: ['#50BB50', '#ff5050'],
            legend:'none',
            pieHole: 0.5,
            backgroundColor: { fill:'transparent' },
            pieSliceTextStyle: {
               color: 'black',
             },
            'width': 230,
               'height': 230,
            chartArea:{left:0,right:10,top:10,bottom:15,width:'90%',height:'95%'}
            };
            if (data3.getNumberOfRows() === 0) {
         data3.addRows([
          ['', 0, null, 'No Data for Action']
         ]);
         }
              var chart3 = new google.visualization.PieChart(document.getElementById('piechart3'));
              chart3.draw(data3, options3);
            var data4 = new google.visualization.DataTable();
            data4.addColumn('string', 'errorcode');
            data4.addColumn('number', 'values');
            <#list errorCodes?keys as key> 
                 data4.addRow(['${key}',${errorCodes[key]}]); 
            </#list>  
            var i=0;
              var options4 = {
            fontSize:12,
            
         slices: {
         <#list colorCodes as code> 
         ${code_index}:{color:'${code}'},
         </#list>
         },
            sliceVisibilityThreshold:.10,
            legend: {'position':'right','alignment':'center'},
            pieHole: 0.5,
            backgroundColor: { fill:'transparent' },
            pieSliceTextStyle: {
               color: 'black',
             },
            'width': 500,
               'height': 230,
            
            chartArea:{width:'100%',height:'90%'}
            };
               
            colorvalue="false";
              var chart4 = new google.visualization.PieChart(document.getElementById('piechart4'));
              chart4.draw(data4, options4);
            
         }
         
            
      </script>
      <script>
         var stepMap=new Map();
         var scenarioMap=new Map();
         var idMapWithTag=new Map();
         function myFunction(value) {
         var y = document.getElementById("myInput");
         
         var serachParam=y.value.toLowerCase();
         var tagList=null;
         <#list searchTag?keys as id>
         
         
         tagList=new Array();
         <#list searchTag[id] as tagforExecution>
         
         tagList.push("${tagforExecution}")
         </#list>
         idMapWithTag.set("${id}",tagList);
         </#list>
         
         var myArray=new Array();
         
         if(serachParam==="" || serachParam==="All"){
         document.getElementById("errorMessage").innerHTML = "";
         document.getElementById("myInput").style.backgroundColor="white";
         document.getElementById("detailTable").style.display="block";
         document.getElementById("addminus").style.display="block";
         document.getElementById("addplus").style.display="block";
         //document.getElementById("seperator").style.display="block";
         try{
         document.getElementById("emptyCatsClassId").style.display="none"
         }
         catch(e){}
         var myArray=new Array();
         
         <#list stepmap?keys as tagValues>
         var elems = document.getElementsByClassName('${tagValues}');
         for(var i = 0; i != elems.length; ++i)
         {
         elems[i].style.visibility = "visible";
         }
         var elemsTable = document.getElementsByClassName('${tagValues}_Table');
         for(var i = 0; i != elemsTable.length; ++i)
         {
         if(value==='tag'){
         elemsTable[i].style.display = "block";
		 }
		 else{
		 elemsTable[i].style.display = "";
		 }
         
         }
         myArray.push("${tagValues}");
         </#list>
         
         if($( "#option" ).html()=='Tag Details'){
         newFunction();
         }
         if($( "#option" ).html()=='Feature Details'){
         calculate(myArray);
         }
         
         var specialClassinIf=document.getElementsByClassName("steps");
         
         for (k = 0; k < specialClassinIf.length; k++) {
         if(specialClassinIf[k].parentNode.parentNode.style.display==="block"){
         specialClassinIf[k].style.visibility = "visible";
         }
         else{
         specialClassinIf[k].style.visibility = "inherit";
         }
         }
         
         }
         else{
         document.getElementById("myInput").style.backgroundColor="white";
         
         var myArray=new Array();
         try{
         <#list stepmap?keys as tagValues>
         var elems = document.getElementsByClassName('${tagValues}');
         for(var i = 0; i != elems.length; ++i)
         {
         elems[i].style.visibility = "collapse";
         }
         
         var elemsTable = document.getElementsByClassName('${tagValues}_Table');
         for(var i = 0; i != elemsTable.length; ++i)
         {
         elemsTable[i].style.display = "none";
         }
         
         var re = new RegExp(serachParam, 'gim');
         
         var res = "${tagValues}".match(re);
         if(res!=null){
         myArray.push("${tagValues}");
         
         }
         </#list>
         }
         catch(err){
         var flagError=true;
         document.getElementById("myInput").style.backgroundColor="red";
         }
         
         calculate(myArray);
         if(myArray.length==0){
         if(flagError){
         document.getElementById("errorMessage").innerHTML = "Invalid Regular Expression";
         }
         else{
         document.getElementById("errorMessage").innerHTML = "No Data for Current search";
         }
         document.getElementById("detailTable").style.display="none";
         document.getElementById("myInput").style.backgroundColor="red";
         
         }
         else{
         document.getElementById("errorMessage").innerHTML = "";
         document.getElementById("detailTable").style.display="block";
         try{
         document.getElementById("emptyCatsClassId").style.display="none";
         }
         catch(e){}
         document.getElementById("myInput").style.backgroundColor="white";
         for(var j=0;j<myArray.length;j++){
         var matchesTr = document.querySelectorAll("tr[class*='"+myArray[j]+"']");
         var matchesTrTable = document.querySelectorAll("table[class*='"+myArray[j]+"_Table']");
         for (i = 0; i < matchesTr.length; i++) {
         matchesTr[i].style.visibility = "visible";
         }
         for (i = 0; i < matchesTrTable.length; i++) {
         matchesTrTable[i].style.display = "block";
         }
         }
         var specialClass=document.getElementsByClassName("steps");
         for (j = 0; j < specialClass.length; j++) {
         if(specialClass[j].parentNode.parentNode.style.display==="block"){
         specialClass[j].style.visibility = "visible";
         }
         else{
         specialClass[j].style.visibility = "inherit";
         }
         }
         }
         }
         }
         function newFunction(){
         google.charts.load("current", {packages:["corechart"]});
              google.charts.setOnLoadCallback(drawChart);
              function drawChart() {
               var data1 = google.visualization.arrayToDataTable([
                  ['Scenario', 'Count'],
                  ['PASSED',      ${overAllPassCountScenario}],
                  ['FAILED',       ${overAllFailCountScenario}],
                  
                  ['PARTIALLY SKIPPED',       ${overAllPartiallySkipCountScenario}]
                  
                ]);
                
                var options1 = {
              fontSize:12,
              colors: ['#50BB50', '#ff5050','#FFB850'],
              legend:'none',
              pieHole: 0.5,
              backgroundColor: { fill:'transparent' },
              pieSliceTextStyle: {
                 color: 'black',
               },
              'width': 230,
                 'height': 230,
              
              chartArea:{left:0,right:10,top:10,bottom:15,width:'90%',height:'95%'}
                };
              
                var chart1 = new google.visualization.PieChart(document.getElementById('piechart1'));
                chart1.draw(data1, options1);
              var data2 = google.visualization.arrayToDataTable([
                  ['TestCases', 'Count'],
                  ['PASSED',      ${stepdefPassCount}],
                  ['FAILED',       ${stepdefFailCount}],
                  ['SKIPPED',       ${stepdefSkipCount}],
                  ['PARTIALLY SKIPPED',       ${stepdefPartiallySkippedCount}]
                  
                ]);
              
                var options2 = {
              	fontSize:12,
             colors: ['#50BB50', '#ff5050','#56aff1','#FFB850'],
              legend:'none',
              pieHole: 0.5,
              backgroundColor: { fill:'transparent' },
              pieSliceTextStyle: {
                 color: 'black',
               },
              'width':230,
                 'height': 230,
              chartArea:{left:0,right:10,top:10,bottom:15,width:'90%',height:'95%'}
                 };
                var chart2 = new google.visualization.PieChart(document.getElementById('piechart2'));
                chart2.draw(data2, options2);
              var data3 = google.visualization.arrayToDataTable([
                  ['TestSteps', 'Count'],
                  ['PASSED',     ${testStepPassCount}],
                  ['FAILED',      ${testStepFailCount}]
                ]);
                var options3 = {
              fontSize:12,
              colors: ['#50BB50', '#ff5050'],
              legend:'none',
              pieHole: 0.5,
              backgroundColor: { fill:'transparent' },
              pieSliceTextStyle: {
                 color: 'black',
               },
              'width': 230,
                 'height': 230,
              
              chartArea:{left:0,right:10,top:10,bottom:15,width:'90%',height:'95%'}
              };
              if (data3.getNumberOfRows() === 0) {
          data3.addRows([
            ['', 0, null, 'No Data for Action']
          ]);
         }
                var chart3 = new google.visualization.PieChart(document.getElementById('piechart3'));
                chart3.draw(data3, options3);
              var data4 = new google.visualization.DataTable();
              data4.addColumn('string', 'errorcode');
              data4.addColumn('number', 'values');
              <#list errorCodes?keys as key> 
                   data4.addRow(['${key}',${errorCodes[key]}]); 
              </#list>  
              var i=0;
                var options4 = {
              fontSize:12,
           slices: {
           <#list colorCodes as code> 
           ${code_index}:{color:'${code}'},
           </#list>
           },
              sliceVisibilityThreshold:.10,
              legend: {'position':'right','alignment':'center'},
              pieHole: 0.5,
              backgroundColor: { fill:'transparent' },
              pieSliceTextStyle: {
                 color: 'black',
               },
              'width': 500,
                 'height': 230,
              
              chartArea:{width:'100%',height:'90%'}
              };
                 
              colorvalue="false";
                var chart4 = new google.visualization.PieChart(document.getElementById('piechart4'));
                chart4.draw(data4, options4);
            }
         }
         function calculate(givenArray){
         var myArray=givenArray;
         var passStep=0;
         var failStep=0;
         var skipStep=0;
         var undefinedStep=0;
         var passScenario=0;
         var failScenario=0;
         var skipScenario=0;
         var undefinedScenario=0;
         var actionStatusPass=0;
         var actionStatusFail=0;
         var errorMapValues=new Map();
         var caughtItems=new Array();
         if(myArray.length > 0){
         for(var i=0;i<myArray.length;i++){
         var numberofExecution=idMapWithTag.keys();
         for(var j=0;j<idMapWithTag.size;j++){
         var flagItem=false;
         var keyExecutionId=numberofExecution.next().value;
         var items=idMapWithTag.get(keyExecutionId);
         if(typeof items !== "undefined" && caughtItems.length > 0){
         for(var p=0;p<caughtItems.length;p++){
         if(keyExecutionId===caughtItems[p]){
         flagItem=true;
         break;
         }
         }
         }
         if(flagItem==false)
         {
         if(typeof items !== "undefined"){
         for(var k=0;k<items.length;k++){
         if(myArray[i]===items[k]){
         <#list scenariomapforGraph?keys as tagValuesforGraphValues>
         if("${tagValuesforGraphValues}"===keyExecutionId){
         var thisScenarioStatus="${scenariomapforGraph[tagValuesforGraphValues]}";
         if(thisScenarioStatus==="PASS"){
         	passScenario=passScenario+1;
         }
         else if(thisScenarioStatus==="FAIL"){
         	failScenario=failScenario+1;
         }
         else if(thisScenarioStatus==="SKIPPED"){
         	skipScenario=skipScenario+1;
         }
         else if(thisScenarioStatus==="UNDEFINED"){
         	undefinedScenario=undefinedScenario+1;
         }
         }
         </#list>
         <#list stepmapforGraph?keys as tagValuesforstepGraphValues>
         if("${tagValuesforstepGraphValues}"===keyExecutionId){
         <#list stepmapforGraph[tagValuesforstepGraphValues]?keys as statusValue>
         if("${statusValue}"==="APASS"){
         var value=${stepmapforGraph[tagValuesforstepGraphValues][statusValue]};
         passStep=passStep+value;
         }
         else if("${statusValue}"==="BFAIL"){
         var value=${stepmapforGraph[tagValuesforstepGraphValues][statusValue]};
         failStep=failStep+value;
         }
         else if("${statusValue}"==="SKIPPED"){
         var value=${stepmapforGraph[tagValuesforstepGraphValues][statusValue]};
         skipStep=skipStep+value;
         }
         else if("${statusValue}"==="UNDEFINED"){
         var value=${stepmapforGraph[tagValuesforstepGraphValues][statusValue]};
         undefinedStep=undefinedStep+value;
         }
         </#list>
         }
         </#list>
         <#list actioncodeMapValuesForGraph?keys as actionExecutionId>
         if("${actionExecutionId}"===keyExecutionId){
         <#list actioncodeMapValuesForGraph[actionExecutionId]?keys as Actionstatus>
         if("${Actionstatus}"==="PASSED"){
         var value=${actioncodeMapValuesForGraph[actionExecutionId][Actionstatus]};
         actionStatusPass=actionStatusPass+value;
         }
         else if("${Actionstatus}"==="FAILED"){
         var value=${actioncodeMapValuesForGraph[actionExecutionId][Actionstatus]};
         actionStatusFail=actionStatusFail+value;
         }
         </#list>
         }
         </#list>
         <#list errorCodeForGraph?keys as errorCodeExecutionId>
         if("${errorCodeExecutionId}"===keyExecutionId){
         <#list errorCodeForGraph[errorCodeExecutionId]?keys as errors>
         var value=${errorCodeForGraph[errorCodeExecutionId][errors]};
         if(errorMapValues.has("${errors}")){
         errorMapValues.set("${errors}",errorMapValues.get("${errors}")+value);
         }
         else{
         errorMapValues.set("${errors}",value);
         }
         </#list>
         }
         </#list>
         caughtItems.push(keyExecutionId);
         }	
         }
         }
         }
         }
         }
         }
         google.charts.load("current", {packages:["corechart"]});
              google.charts.setOnLoadCallback(drawChartforTag);
              function drawChartforTag() {
               var data1 = google.visualization.arrayToDataTable([
                  ['Scenario', 'Count'],
                  ['PASSED',      passScenario],
                  ['FAILED',       failScenario],
                  ['SKIPPED',       skipScenario],
                  ['PARTIALLY SKIPPED',       undefinedScenario],
                ]);
                var options1 = {
              fontSize:12,
              colors: ['#50BB50', '#FF5050','#56aff1','#FFB850'],
              legend:'none',
              pieHole: 0.5,
              backgroundColor: { fill:'transparent' },
              pieSliceTextStyle: {
                 color: 'black',
               },
              'width': 230,
                 'height': 230,
              chartArea:{left:0,right:10,top:10,bottom:15,width:'90%',height:'95%'}
                };
                var chart1 = new google.visualization.PieChart(document.getElementById('piechart1'));
                chart1.draw(data1, options1);
         var data2 = google.visualization.arrayToDataTable([
                  ['TestCases', 'Count'],
                  ['PASSED',      passStep],
                  ['FAILED',      failStep],
                  ['SKIPPED',       skipStep],
                  ['PARTIALLY SKIPPED',       undefinedStep]
                ]);
                var options2 = {
              	fontSize:12,
              colors: ['#50BB50', '#ff5050','#56aff1','#FFB850'],
              legend:'none',
              pieHole: 0.5,
              backgroundColor: { fill:'transparent' },
              pieSliceTextStyle: {
                 color: 'black',
               },
              'width':230,
                 'height': 230,
              chartArea:{left:0,right:10,top:10,bottom:15,width:'90%',height:'95%'}
                 };
                var chart2 = new google.visualization.PieChart(document.getElementById('piechart2'));
                chart2.draw(data2, options2);
         var data3 = google.visualization.arrayToDataTable([
                  ['TestSteps', 'Count'],
                  ['PASSED',     actionStatusPass],
                  ['FAILED',      actionStatusFail]
                ]);
                var options3 = {
              fontSize:12,
              colors: ['#50BB50', '#ff5050'],
              legend:'none',
              pieHole: 0.5,
              backgroundColor: { fill:'transparent' },
              pieSliceTextStyle: {
                 color: 'black',
               },
              'width': 230,
                 'height': 230,
              chartArea:{left:0,right:10,top:10,bottom:15,width:'90%',height:'95%'}
              };
              if (data3.getNumberOfRows() === 0) {
          data3.addRows([
            ['', 0, null, 'No Data for Action']
          ]);
         }
                var chart3 = new google.visualization.PieChart(document.getElementById('piechart3'));
                chart3.draw(data3, options3);
         var data4 = new google.visualization.DataTable();
              data4.addColumn('string', 'errorcode');
              data4.addColumn('number', 'values');
               function printTwo(values, key)  
         { 
         data4.addRow([key,values]); 
         } 
              errorMapValues.forEach(printTwo); 
              var i=0;
                var options4 = {
              fontSize:12,
           slices: {
           <#list colorCodes as code> 
           ${code_index}:{color:'${code}'},
           </#list>
           },
              sliceVisibilityThreshold:.10,
              legend: {'position':'right','alignment':'center'},
              pieHole: 0.5,
              backgroundColor: { fill:'transparent' },
              pieSliceTextStyle: {
                 color: 'black',
               },
              'width': 500,
                 'height': 230,
              
              chartArea:{width:'100%',height:'90%'}
              };
              colorvalue="false";
                var chart4 = new google.visualization.PieChart(document.getElementById('piechart4'));
                chart4.draw(data4, options4);
              }
         }
         $(document).ready(function () {
           var $switchLabelOn = $('.on');
		   var $switchLabelOff = $('.off');
           var on="#"+$switchLabelOn[0].innerHTML;
           var off="#"+$switchLabelOff[0].innerHTML;
           $(on).show();
           $(off).hide();
           $('.switch-input').on('change', function () {
           var isChecked = $(this).is(':checked');
           if (isChecked) {
         document.getElementById("myInput").value="";
           $(on).show();
           $(off).hide();
         $("#option").html("Tag Details");
           myFunction('scenario');
           try{
           document.getElementById("emptyCatsClassId").style.display="block";
           }
           catch(e){}
           }
           else{
           $(on).hide();
           $(off).show();
         $("#option").html("Feature Details");
           myFunction('tag');
           }
           });
           function setSwitchState(el, flag) {
           el.attr('checked', flag);
           }
           setSwitchState($('.switch-input'), true);
           });
      </script>
   </body>
</html>