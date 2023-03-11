# һ��layui��ϰ
ǰ�˴���
```html
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>��ʼʹ�� layui</title>
    <link href="./layui-v2.7.6/layui/css/layui.css" rel="stylesheet">
</head>

<body>

    <!-- ��� HTML ���� -->

    <table class="layui-table">
        <colgroup>
            <col width="150">
            <col width="200">
            <col>
        </colgroup>
        <thead>
            <tr>
                <th>���</th>
                <th>����</th>
                <th>�绰</th>
                <th>�Ա�</th>
            </tr>
        </thead>
        <tbody>

            <tr v-for="list in formList">
                <td>{{list.id}}</td>
                <td>{{list.username}}</td>
                <td>{{list.number}}</td>
                <td>{{list.gender}}</td>
            </tr>
        </tbody>
    </table>

    <script src="./layui-v2.7.6/layui/layui.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/vue@2.6.14/dist/vue.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>

    <script>
        layui.use(['layer', 'form'], function () {
            var layer = layui.layer;
            var form = layui.form;

            layer.msg('Hello World');
        });


        new Vue({
            el: ".layui-table",
            data() {
                return {
                    formList: []

                }
            },
            mounted() {
                axios({
                    method: "get",
                    url: "http://localhost:8080/Student",
                }).then(resp => {
                    console.log(resp)
                    this.formList = resp.data
                })
            }
        })
    </script>
</body>

</html>
```