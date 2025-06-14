<table border="1">
    <tr><th>Student Code</th><th>Name</th><th>Subject</th><th>Score1</th><th>Score2</th><th>Grade</th><th>Letter</th></tr>
    <c:forEach var="s" items="${list}">
        <tr>
            <td>${s.code}</td>
            <td>${s.name}</td>
            <td>${s.subject}</td>
            <td>${s.score1}</td>
            <td>${s.score2}</td>
            <td>${s.grade}</td>
            <td>${s.letter}</td>
        </tr>
    </c:forEach>
</table>