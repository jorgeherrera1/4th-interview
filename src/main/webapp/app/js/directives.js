'use strict';

fourthInterviewApp.directive('sideMenu', function() {
    return {
        restrict: 'E',
        scope: {},
        controller: function($scope) {
            var items = $scope.items = [];

            $scope.select = function(item) {
                angular.forEach(items, function(item) {
                    item.selected = false;
                });

                item.selected = true;
            };

            this.addItem = function(item) {
                if (items.length == 0) {
                    $scope.select(item);
                }

                items.push(item);
            };
        },
        templateUrl: 'partials/side-menu.html',
        replace: true,
        transclude: true
    };
});

fourthInterviewApp.directive('sideMenuItem', function() {
    return {
        require: '^sideMenu',
        restrict: 'E',
        scope: {
            url: '@',
            title: '@'
        },
        link: function(scope, element, attrs, sideMenuCtrl) {
            sideMenuCtrl.addItem(scope);
        }
    };
});