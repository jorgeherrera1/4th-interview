'use strict';

fourthInterviewApp.controller('appCtrl', function($scope) {
    $scope.appTitle = '4th Interview';
});

fourthInterviewApp.controller('skillCtrl', function($scope) {
    $scope.skills = [
        { name: 'Java', description: 'Java Programming Language' },
        { name: 'PHP', description: 'PHP Programming Language' },
        { name: 'OO', description: 'General Purpose Object Orientation' },
        { name: 'Design Patterns', description: 'Object Oriented Design Patterns' },
        { name: 'Web', description: 'General Purpose Web Development' },
        { name: 'JavaScript', description: 'JavaScript Programming Language' },
        { name: 'SQL', description: 'Structured Query Language' }
    ];
});