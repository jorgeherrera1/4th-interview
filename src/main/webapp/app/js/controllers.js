'use strict';

fourthInterviewApp.controller('appCtrl', ['$scope', '$http', function($scope, $http) {
    $scope.appTitle = '4th Interview';

    $scope.isWaitingForServer = function() {
        return $http.pendingRequests.length > 0;
    }
}]);

fourthInterviewApp.controller('sideMenuCtrl', ['$scope', function($scope) {
    $scope.activeSideMenuItem = 'Quick Interview';

    $scope.isSideMenuItemActive = function(sideMenuItem) {
        return $scope.activeSideMenuItem == sideMenuItem;
    };
}]);

fourthInterviewApp.controller('skillViewCtrl', ['$scope', 'allSkills', '$dialog', function($scope, allSkills, $dialog) {
    var allSkills = $scope.allSkills = allSkills;

    $scope.modifySkill = function(skill) {
        alert('Modify: ' + JSON.stringify(skill));
    }

    $scope.removeSkill = function(skill) {
        var title = 'Remove Skill';
        var msg = 'Are you sure you want to remove ' + skill.name + '?';
        var btns = [{result:'no', label: 'No'}, {result:'yes', label: 'Yes', cssClass: 'btn-danger'}];

        var removeSkillSecondCheck = function(result) {
            if (result == 'yes') {
                var skillIndex = allSkills.indexOf(skill);
                allSkills.splice(skillIndex, 1);
            }
        }

        $dialog.messageBox(title, msg, btns).open().then(removeSkillSecondCheck);
    }
}]);