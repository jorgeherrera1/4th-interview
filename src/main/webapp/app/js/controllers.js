'use strict';

fourthInterviewApp.controller('appCtrl', ['$scope', '$http', function($scope, $http) {
    $scope.appTitle = '4th Interview';

    $scope.isWaitingForServer = function() {
        return $http.pendingRequests.length > 0;
    };

    $scope.closeNotification = function(notification) {
        var notificationIndex = $scope.notifications.indexOf(notification);
        $scope.notifications.splice(notificationIndex, 1);
    };
}]);

fourthInterviewApp.controller('questionViewCtrl', ['$scope', function($scope) {
    $scope.questions = [
        {question: 'Explain the difference between interface and abstract class', expectedAnswer: 'expectedAnswer1', level: "Junior"},
        {question: 'What is the ready() function used for?', expectedAnswer: 'expectedAnswer2', level: 'Intermediate'},
        {question: 'What is a static method?', expectedAnswer: 'expectedAnswer3', level: 'Advanced'}
    ];
}]);

fourthInterviewApp.controller('sideMenuCtrl', ['$scope', function($scope) {
    $scope.activeSideMenuItem = 'Quick Interview';

    $scope.isSideMenuItemActive = function(sideMenuItem) {
        return $scope.activeSideMenuItem == sideMenuItem;
    };
}]);

fourthInterviewApp.controller('skillEditCtrl', ['$scope', 'dialog', 'skill', 'skillService',
function($scope, dialog, skill, skillService){
    $scope.skill = angular.copy(skill);

    $scope.saveSkill = function() {
        skillService.saveSkill($scope.skill, function(data) {
            $scope.skill = data;

            $scope.notifications.push({
                type: 'success',
                text: $scope.skill.name + ' was successfully saved'
            });

            dialog.close($scope.skill);
        });
    };

    $scope.closeSkillDialog = function() {
        dialog.close();
    };
}]);

fourthInterviewApp.controller('skillViewCtrl', ['$scope', 'allSkills', 'skillService', '$dialog',
function($scope, allSkills, skillService, $dialog) {
    $scope.allSkills = allSkills;

    $scope.newSkill = function() {
        var skillEditDialog = $dialog.dialog({
            resolve:  {
                skill: function() {
                    return {};
                }
            }
        });
        skillEditDialog.open('partials/skill-edit.html', 'skillEditCtrl').then(function(result) {
            if (result) {
                $scope.allSkills.push(result);
            }
        });
    };

    $scope.modifySkill = function(skill) {
        var skillEditDialog = $dialog.dialog({
            resolve: {
                skill: function() {
                    return angular.copy(skill);
                }
            }
        });
        skillEditDialog.open('partials/skill-edit.html', 'skillEditCtrl').then(function(result) {
            angular.extend(skill, result);
        });
    };

    $scope.removeSkill = function(skill) {
        var title = 'Remove Skill';
        var msg = 'Are you sure you want to remove ' + skill.name + '?';
        var btns = [{result:'no', label: 'No', cssClass: 'btn-small'},
            {result:'yes', label: 'Yes', cssClass: 'btn-danger'}];

        var removeSkillSecondCheck = function(result) {
            if (result == 'yes') {
                skillService.removeSkill(skill, function() {
                    var skillIndex = $scope.allSkills.indexOf(skill);
                    $scope.allSkills.splice(skillIndex, 1);

                    $scope.notifications.push({
                        type: 'success',
                        text: skill.name + ' was successfully removed from the skills'
                    });
                });
            }
        };

        $dialog.messageBox(title, msg, btns).open().then(removeSkillSecondCheck);
    };
}]);