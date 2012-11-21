<c:import url="/WEB-INF/jsp/common/layout.jsp" charEncoding="UTF-8">
    <c:param name="title" value="4th Interview :: Home" />
    <c:param name="content">
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span8 offset2">
                    <div class="hero-unit">
                        <h2>Quick Interview</h2>
                        <p>
                            <label for="candidateName">Name:</label>
                            <input id="candidateName" type="text" placeholder="Name" style="width: 240px;" />
                            <label for="candidateAge">Age:</label>
                            <input id="candidateAge" type="text" placeholder="Age" style="width: 40px;" />
                            <label id="interviewDifficulty">Difficulty:</label>
                            <div id="difficulties"></div>
                        </p>
                        <p>
                            <button class="btn btn-large btn-primary" type="button">Start Now &raquo;</button>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </c:param>
    <c:param name="javascript">
        <script src="${pageContext.request.contextPath}/js/difficulty-widget.js"></script>
        <script>
        $(document).ready(function() {
        	$('#difficulties').difficulty({serviceUrl: '${pageContext.request.contextPath}/rest/difficulty'});
        });
        </script>
    </c:param>
</c:import>