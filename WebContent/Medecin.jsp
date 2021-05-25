<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<meta charset="ISO-8859-1">
<div id="Hopital">
    <form action="controleur.do" method ="post">
    <table>
    <h2>Formulaire de Gestion Des Medecins</h2>
        <tr>
            <td>Nom Du Medecin</td>
            <td>
            	<input type="text" size=50 name="nom">
            </td>
        </tr>
        
        <tr>
            <td>prenom</td>
            <td><input type="text" size=50 name="prenom"></td>
        </tr>
        
        <tr>
            <td>Matricule</td>
            <td><input type="text"  size=50 name="matricule"></td>
        </tr>
    
        <tr>
            <td>Telephonne</td>
            <td><input type="text" size=50 name="telephonne"></td>
        </tr>
        <tr>
            <td>Service</td>
            <td><input type="text"  size=50 name="sexe"></td>
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