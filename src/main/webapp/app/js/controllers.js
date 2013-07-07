'use strict';

fourthInterviewApp.controller('tagController', function($scope, tagResource) {
    $scope.tags = [
        { name: 'Java', description: 'Java Programming Language' },
        { name: 'PHP', description: 'PHP Programming Language' },
        { name: 'OO', description: 'General Purpose Object Orientation' },
        { name: 'Design Patterns', description: 'Object Oriented Design Patterns' },
        { name: 'Web', description: 'General Purpose Web Development' },
        { name: 'JavaScript', description: 'JavaScript Programming Language' },
        { name: 'SQL', description: 'Structured Query Language' }
    ];

    var result = tagResource.query();
    $scope.mytest = result;
});