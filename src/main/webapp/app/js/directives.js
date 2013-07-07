'use strict';

fourthInterviewApp.directive('sideMenu', function() {
    return {
        restrict: 'A',
        templateUrl: 'partials/side-menu.html'
    }
});

fourthInterviewApp.directive('header', function() {
    return {
        restrict: 'A',
        templateUrl: 'partials/header.html'
    }
});
