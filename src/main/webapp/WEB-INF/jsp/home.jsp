<c:import url="/WEB-INF/jsp/common/layout.jsp" charEncoding="UTF-8">
    <c:param name="title" value="4th Interview :: Home" />
    <c:param name="content">
        <div class="hero-unit">
            <p>
                <input id="candidateName" class="input-block-level" type="text" placeholder="Name" />
                <input id="candidateAge" class="input-block-level" type="text" placeholder="Age" />
            </p>
            <p>
                <button id="quickInterviewButton" class="btn btn-primary btn-large">Quick Interview &raquo;</button>
            </p>
        </div>
    </c:param>
    <c:param name="javascript">
        <script>
        $(document).ready(function() {
        	$('#quickInterviewButton').click(function() {
        		var candidateName = $('#candidateName').val();
        		var candidateAge = $('#candidateAge').val();
        		
        		$.ajax({
        			  type: 'POST',
        			  url: '${pageContext.request.contextPath}/rest/candidates',
        			  data: JSON.stringify({
        				  'name': candidateName,
        				  'age': candidateAge
        			  }),
        			  success: function(data, textStatus, jqXHR) {
        				  alert(textStatus);
        			  },
        			  dataType: 'json',
        			  contentType: 'application/json' 
        		});
        	});
        });
        </script>
    </c:param>
</c:import>