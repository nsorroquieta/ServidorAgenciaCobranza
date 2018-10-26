<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html
        PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:f="http://java.sun.com/jsf/core"
      xmlns:p="http://primefaces.org/ui"
      xmlns:b="http://bootsfaces.net/ui">

<h:head>
    <title>Obligatorio J2EE</title>
</h:head>
<h:body>
    <b:navBar brand="Java" brandHref="#" fluid="true">
        <b:navbarLinks>
            <b:dropMenu value="Reporte Ventas" iconAwesome="book">
                <b:navLink header="Reporte Ventas"/>
                <b:navLink iconAwesome="list-alt" value="Ventas" href="/servlet/listarTickets.xhtml"/>
            </b:dropMenu>
        </b:navbarLinks>
    </b:navBar>
</h:body>
</html>