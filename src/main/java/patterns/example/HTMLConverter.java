package patterns.example;

public class HTMLConverter {

    public static String convertToHTML(String data){
        StringBuilder htmlBuilder = new StringBuilder();

        htmlBuilder.append("<html>");
        htmlBuilder.append("<body>");
        htmlBuilder.append("<table>");

        htmlBuilder.append("<tr><td>");
        htmlBuilder.append(data);
        htmlBuilder.append("</td></tr>");

        htmlBuilder.append("</table>");
        htmlBuilder.append("</body>");
        htmlBuilder.append("</html>");

        return htmlBuilder.toString();
    }

}
