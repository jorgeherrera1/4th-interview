<c:import url="/WEB-INF/jsp/common/layout.jsp" charEncoding="UTF-8">
    <c:param name="title" value="4th Interview :: Home" />
    <c:param name="content">
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span8 offset2">
                    <div class="container-fluid hero-unit">
                        <form>
                            <fieldset>
                                <legend>Quick Interview</legend>
                                <div class="row-fluid">
                                    <div class="span6">   
                                        <label>Name:</label>
                                        <input id="candidateName" class="input-large" type="text" placeholder="Name" />
                                        <div class="input-append">
                                            <label>Age:</label>
                                            <input id="candidateAge" class="input-mini" type="text" placeholder="Age" />
                                            <span class="add-on">years</span>
                                        </div>
                                        <div id="difficulty"></div>
                                    </div>
                                    <div class="span6">
                                        <label>Tags:</label>
                                        
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </c:param>
    <c:param name="javascript">
        <script src="http://ajax.microsoft.com/ajax/jquery.templates/beta1/jquery.tmpl.js"></script>
        <script src="${pageContext.request.contextPath}/js/difficulty-widget.js"></script>
        <script>
        $(document).ready(function() {
        	$('#difficulty').difficulty({serviceUrl: '${pageContext.request.contextPath}/rest/difficulty'});
        });
        </script>
    </c:param>
</c:import>