'use strict';

fourthInterviewApp.factory('skillService', ['$http', function($http) {
    return {
        listAllSkills: function(successCallback) {
            $http.get('/skills/listAll.json').success(successCallback);
        },

        removeSkill: function(skill, successCallback) {
            $http.post('/skills/remove.json', skill).success(successCallback);
        }
    };
}]);