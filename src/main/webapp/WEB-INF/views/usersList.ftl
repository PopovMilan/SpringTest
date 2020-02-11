<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>

<body>
<h1>Word list</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Value</th>
    </tr>
   <#list users as user>
       <tr>
           <td><a href="/user/${user.id}">${user.id}</a></td>
           <td>${user.name}</td>
           <td>${user.value}</td>
           <td><a href="/delete/${user.id}">Delete word</a></td>
           <td><a href="/update/${user.id}">Update</a> </td>
       </tr>
   </#list>
</table>
<a href="/addUser">Add word</a>
<p><b>Search word</b><br>
<form name = "user" action="/userW" method="post">
    <input type="text" size="40" name="name">
    <input type="submit" value="Search">
</form>
</p>
</body>
</html>