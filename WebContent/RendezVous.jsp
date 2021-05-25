<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<meta charset="ISO-8859-1">
<div id="Hopital">
    <form action="controleur.do" method ="post">
    <table>
    <h2>Formulaire de RendezVous </h2>
        <tr>
            <td>Libellé</td>
            <td>
            	<input type="text" size=50 name="Libellé">
            </td>
        </tr>
        
        <tr>
            <td>Date</td>
            <td><input type="text" size=50 name="Date"></td>
        </tr>
        
        <tr>
            <td>
                <input type="submit" name="action"value="Ajouter">
            </td>
            
            <td>
                <input type="submit" name="action"value="Supprimer">
            </td>
            
             <td>
                <input type="submit" name="action"value="Modifier">
            </td>
        </tr>
    </table>
    </form>
</div>
<div>
	
</div>

</body>
</html>