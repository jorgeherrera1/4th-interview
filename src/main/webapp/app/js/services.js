'use strict';

fourthInterviewApp.factory('skillService', function($http) {
    return {
        listAllSkills: function(successCallback, failCallback) {
            $http({method: 'GET', url: '/skills/listAll'}).
                success(successCallback).
                error(failCallback);
        }
    };
});