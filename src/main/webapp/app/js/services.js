'use strict';

fourthInterviewApp.factory('skillService', ['$http', function($http) {
    return {
        listAllSkills: function(successCallback) {
            return $http.get('/skills/listAll').success(successCallback);
        }
    };
}]);