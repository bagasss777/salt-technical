<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Konsumen Management</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

    <!-- Add DataTables CSS -->
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap4.min.css">

    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

    <!-- Add DataTables JavaScript -->
    <script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
</head>
<body>

<div class="container my-2">
    <div class="card">
        <div class="card-body">
            <p class="my-5">
                <a href="/add" class="btn btn-success">
                    Add Data</a>
            </p>
            <div class="col-md-10">
                <table id="konsumenTable" class="table table-striped table-responsive-md">
                    <thead>
                    <tr>
                        <th>id</th>
                        <th>Nama</th>
                        <th>Alamat</th>
                        <th>Kota</th>
                        <th>Provinsi</th>
                        <th>Tanggal Registrasi</th>
                        <th>Status</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${konsumenList}" var="konsumen">
                        <tr class="data-row">
                            <td>${konsumen.id}</td>
                            <td>${konsumen.nama}</td>
                            <td>${konsumen.alamat}</td>
                            <td>${konsumen.kota}</td>
                            <td>${konsumen.provinsi}</td>
                            <td>${konsumen.tglRegistrasi}</td>
                            <td>${konsumen.status}</td>
                            <td>
                                <a class="btn btn-warning" href="/edit?id=${konsumen.id}" >
                                    Edit</a>
                            </td>
                            <td>
                                <form action="/delete?id=${konsumen.id}" method="post">
                                    <input class="btn btn-danger" type="submit" value="Delete" />
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<script>
    $(document).ready(function () {
        $('#konsumenTable').DataTable();
    });
</script>
</body>
</html>
