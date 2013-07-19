'use strict';

fourthInterviewApp.factory('skillService', ['$http', function($http) {
    return {
        listAllSkills: function(successCallback, failCallback) {
            $http({method: 'GET', url: '/skills/listAll'}).
                success(successCallback).
                error(failCallback);
        }
    };
}]);