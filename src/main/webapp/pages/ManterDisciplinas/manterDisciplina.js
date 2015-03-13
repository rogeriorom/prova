module = angular.module("app", []);

module.controller("disciplinaController", ["$scope","$http", disciplinaController]);


function disciplinaController($scope,$http) {
    
    $scope.disciplinas = [];
    
    function Deletar(id) {
        $http.delete("/disciplinas", id).success(onSuccess).error(onError);
        
        function onSuccess(data, status) { 
            console.log("foi");
        }
        function onError(data, status) {
            console.log("não foi");
        }
    }
    
    function Alterar(disciplina) {
        $http.put("/disciplinas", disciplina).success(onSuccess).error(onError);
        
        function onSuccess(data, status) { 
            console.log("foi");
        }
        function onError(data, status) {
            console.log("não foi");
        }
    }
    
    function Salvar(disciplina) {
        $http.post("/disciplinas", disciplina).success(onSuccess).error(onError);
        
        function onSuccess(data, status) { 
            console.log("foi");
        }
        function onError(data, status) {
            console.log("não foi");
        }
    }
    
    function Listar() {
        $http.get("/disciplinas").success(onSuccess).error(onError);
        
        function onSuccess(data, status) {
            $scope.disciplinas = data; 
        }
        function onError(data, status) {
            alert("Deu erro: " + data);
        }
    }
        
}


