/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2022-12-28 13:53:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.BoardVO;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1672060374356L));
    _jspx_dependants.put("jar:file:/C:/Users/seolah/Documents/Java/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MYBOARD/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("vo.BoardVO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<title>SLAH블로그</title>\r\n");
      out.write("<!-- Google Font -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic\">\r\n");
      out.write("<!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("<!-- Bootstrap 3.3.7 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/bootstrap/dist/css/bootstrap.min.css\">\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("<!-- Ionicons -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/Ionicons/css/ionicons.min.css\">\r\n");
      out.write("<!-- Theme style -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/dist/css/AdminLTE.min.css\">\r\n");
      out.write("<!-- AdminLTE Skins. Choose a skin from the css/skins\r\n");
      out.write("     folder instead of downloading all of them to reduce the load. -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/dist/css/skins/_all-skins.min.css\">\r\n");
      out.write("<!-- Morris chart -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/morris.js/morris.css\">\r\n");
      out.write("<!-- jvectormap -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/jvectormap/jquery-jvectormap.css\">\r\n");
      out.write("<!-- Date Picker -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css\">\r\n");
      out.write("<!-- Daterange picker -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/bootstrap-daterangepicker/daterangepicker.css\">\r\n");
      out.write("<!-- bootstrap wysihtml5 - text editor -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://cdn.datatables.net/1.13.1/css/jquery.dataTables.min.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.serializejson.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.6.1.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/Gruntfile.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Content Wrapper. Contains page content -->\r\n");
      out.write("\t<div class=\"content-wrapper\">\r\n");
      out.write("\t    <!-- Content Header (Page header) -->\r\n");
      out.write("\t\t<section class=\"content-header\">\r\n");
      out.write("\t\t\t<h1>SLAH<small>Control panel</small></h1>\r\n");
      out.write("\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"active\">Dashboard</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- Main content -->\r\n");
      out.write("\t\t<section class=\"content\">\r\n");
      out.write("\t\t\t빈공간\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\t<!-- /.content -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.content-wrapper -->\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- jQuery 3 -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("\t<!-- jQuery UI 1.11.4 -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/jquery-ui/jquery-ui.min.js\"></script>\r\n");
      out.write("\t<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t  $.widget.bridge('uibutton', $.ui.button);\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- Bootstrap 3.3.7 -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- Morris.js charts -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/raphael/raphael.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/morris.js/morris.min.js\"></script>\r\n");
      out.write("\t<!-- Sparkline -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/jquery-sparkline/dist/jquery.sparkline.min.js\"></script>\r\n");
      out.write("\t<!-- jvectormap -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("\t<!-- jQuery Knob Chart -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/jquery-knob/dist/jquery.knob.min.js\"></script>\r\n");
      out.write("\t<!-- daterangepicker -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/moment/min/moment.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/bootstrap-daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("\t<!-- datepicker -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("\t<!-- Bootstrap WYSIHTML5 -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\r\n");
      out.write("\t<!-- Slimscroll -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/jquery-slimscroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("\t<!-- FastClick -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/bower_components/fastclick/lib/fastclick.js\"></script>\r\n");
      out.write("\t<!-- AdminLTE App -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/dist/js/adminlte.min.js\"></script>\r\n");
      out.write("\t<!-- AdminLTE dashboard demo (This is only for demo purposes) -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/dist/js/pages/dashboard.js\"></script>\r\n");
      out.write("\t<!-- AdminLTE for demo purposes -->\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath() );
      out.write("/dist/js/demo.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}