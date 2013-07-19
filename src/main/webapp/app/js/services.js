'use strict';

fourthInterviewApp.factory('skillService', ['$http', function($http) {
    return {
        listAllSkills: function() {
            // TODO: replace with AJAX call
            return [
                {name: 'Java', description: 'General knowledge about the Java Programming Language'},
                {name: 'Design Patterns', description: 'Such as Factory, Singleton, Decorator, etc.'},
                {name: 'HTML 5', description: 'All new features of HTML5 not present in the previous version'},
                {name: 'Spring MVC', description: 'How to build web applications using Spring MVC'},
                {name: 'CSS 3', description: 'Most commonly used selectors and styles'},
                {name: 'PHP', description: 'General knowledge about the PHP Programming Language'},
            ];
        }
    };
}]);