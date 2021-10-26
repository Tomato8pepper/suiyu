<%@page contentType="image/x-xbitmap"%>
<%@page import="java.awt.*"%>
<%@page import="java.io.*"%>
<%@page import="java.awt.image.*"%>
<%@page import="java.awt.geom.*"%>
<%@page import="com.sun.image.codec.jpeg.*"%>
<%    int width=260, height=260;
    BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
         Graphics g=image.getGraphics();
         g.setColor(Color.white);
         g.fillRect(0,0,width,height);
         Graphics2D g_2d=(Graphics2D)g;
         Ellipse2D ellipse=new Ellipse2D.Double(40,50,100,40);
         g_2d.setColor(Color.blue);
         g_2d.draw(ellipse);
         Polygon p=new Polygon();
         p.addPoint(12,34);
         p.addPoint(51,134);
         p.addPoint(102,34);
         g_2d.drawPolygon(p);
         g_2d.dispose();
         OutputStream outClient=response.getOutputStream();
         JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(outClient);
         encoder.encode(image);
%>