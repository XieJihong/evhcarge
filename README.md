# evcharge

<script th:inline="javascript">
  /*<![CDATA[*/
  function renderEmails(data, type, full) {
     var markup = "<ul>";
     $.each(data, function (index, email) {
        markup += "<li>" + email.address + "</li>";
     });
     markup += "</ul>";
     return markup;
  }
  /*]]>*/
</script>

<table id="list" class="table table-striped table-condensed table-bordered" dt:table="true" dt:url="@{/contacts/all}">
   <thead>
      <tr>
        <th dt:property="firstname">firstname</th>
        <th dt:property="lastname">lastname</th>
        <th dt:property="emails" dt:renderFunction="renderEmails">emails</th>