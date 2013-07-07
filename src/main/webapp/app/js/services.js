'use strict';

fourthInterviewApp.factory('tagResource', function($resource) {
    return $resource('/rest/tag/:name', {}, {
        query: {
            method: 'GET',
            params: {},
            isArray: false
        }
    });
});