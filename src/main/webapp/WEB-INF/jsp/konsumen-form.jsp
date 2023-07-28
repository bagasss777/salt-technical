<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Konsumen Form Input</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"
          href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script
            src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js">

    </script>
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js">
    </script>
</head>
<body >
<div class="container my-5">
    <h2>Konsumen <c:out value="${konsumen.id != null ? 'Update' : 'Add' }" /></h2>
    <div class="card">
        <div class="card-body">
            <div class="col-md-10">
                <form:form method="POST" modelAttribute="konsumen" action="/home" name="konsumen">
                    <form:hidden path="id"/>

                    <div class="row">
                        <div class="form-group col-md-8">
                            <label for="nama" class="col-form-label"> Nama
                            </label>
                            <form:input path="nama" id="fname" class="form-control" />
                        </div>

                        <div class="form-group col-md-8">
                            <label for="alamat" class="col-form-label"> Alamat
                            </label>
                            <form:input path="alamat" id="alamat" class="form-control"/>
                        </div>

                        <div class="form-group col-md-8">
                            <label for="kota" class="col-form-label" > Kota
                            </label>
                            <form:input path="kota" id="kota" class="form-control"/>
                        </div>

                        <div class="form-group col-md-8">
                            <label for="provinsi" class="col-form-label"> Provinsi
                            </label>
                            <form:input path="provinsi" id="provinsi" class="form-control"/>
                        </div>

                        <div class="form-group col-md-8">
                            <label for="status" class="col-form-label"> Status
                            </label>
                            <form:input path="status" id="status" class="form-control"/>
                        </div>
                    </div>

                    <div class="col-md-6">
                        <input type="submit" class="btn btn-success"
                               value="<c:out value="${konsumen.id != null ? 'Update' : 'Add' }" />">&nbsp;&nbsp;
                        <a href="/list">Konsumen List</a>&nbsp;
                        <c:if test="${konsumen.id ne null}"><b>|</b>&nbsp;<a href="/add">Add</a></c:if>
                    </div>

                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>