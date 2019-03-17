<%-- 
    Document   : amortizacao-constante
    Created on : 15/03/2019, 20:45:20
    Author     : Jefferson Vasconcelos - Lucas Venâncio
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Amortização Constante</title>
    </head>
    <body>
        <%@include file = "WEB-INF/jspf/menu.jspf"%>
        <%@include file = "WEB-INF/jspf/header.jspf"%>
        <h1>Amortização Constante</h1>
        <form>
            <p>Valor Financiamento</p><input type="text" name="financiamento" required><br>
            <p>Tempo (Meses)</p><input type="number" name="tempo" required><br>
            <p>Taxa de Juros (%)</p><input type="text" name="taxa" required><br>
            <p><input type="submit" name="enviar" value="Calcular">
        </form>
        <a href = "home.jsp">Voltar<a>
                <%if (request.getParameter("enviar") != null) {%>
                <%try { %> 
                <hr>
                <%DecimalFormat df = new DecimalFormat("#,##0.00");%> 

                <% double financiamento = Double.parseDouble(request.getParameter("financiamento"));%>
                <% int tempo = Integer.parseInt(request.getParameter("tempo"));%>
                <% double taxa = Double.parseDouble(request.getParameter("taxa"));%>

                <%double devedor = financiamento;%>
                <%double amortizacao = financiamento / tempo;%>
                <%double juros = (taxa * devedor) / 100;%>
                <%double parcela = amortizacao + juros;%>

                <%double totParcela = 0;%>
                <%double totAmortizacao = 0;%>
                <%double totJuros = 0;%>


                <table border = "1">
                    <th>Mês</th>
                    <th>Parcela</th> 
                    <th>Amortização</th>
                    <th>Juros</th>
                    <th>Saldo Devedor</th>
                        <%for (int i = 1; i <= tempo; i++) {%>

                    <%parcela = amortizacao + juros;%>
                    <%devedor -= amortizacao;%>

                    <tr>
                        <td><%=i%></td>
                        <td>R$  <%=df.format(parcela)%></td>
                        <td>R$  <%=df.format(amortizacao)%></td>
                        <td>R$  <%=df.format(juros)%></td>
                        <td>R$  <%=df.format(devedor)%></td>
                    </tr>

                    <%totParcela += parcela;%>
                    <%totAmortizacao += amortizacao;%>
                    <%totJuros += juros;%>
                    <%juros = (taxa * devedor) / 100;%>
                    <%}%>
                    <tr>
                        <td>Total: </td>
                        <td>R$  <%=df.format(totParcela)%></td>
                        <td>R$  <%=df.format(totAmortizacao)%></td>
                        <td>R$  <%=df.format(totJuros)%></td>
                        <td>R$  <%=df.format(devedor)%></td>
                    </tr>
                </table>
                <%} catch (Exception ex) {%>
                <h3 style="color: red">Erro: <%=ex.getMessage()%></h3>
                <%}%>
                <%}%>
                </body>
                <%@include file = "WEB-INF/jspf/footer.jspf"%>
                </html>