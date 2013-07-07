'use strict';

fourthInterviewApp.factory('tagResource', function($resource) {
    return $resource('http://localhost\\:8080/rest/tag/:name', {}, {
        query: {
            method: 'GET',
            params: {},
            isArray: false
        }
    });
});