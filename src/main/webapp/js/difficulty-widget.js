(function($) {
    $.widget('4th.difficulty', {
        
        // These options will be used as defaults
        options: {
            serviceUrl: null
        },

        // Set up the widget (only the first time, like a constructor)
        _create: function() {
            var self = this;
            
            // get the difficulties from the server
            $.ajax({
                url: this.options.serviceUrl,
                dataType: 'json',
                data: null,
                success: function(data, textStatus, jqXHR) {
                    self._cacheDifficulties(data);
                    self._createDropdown();
                }
            });
        },
        
        _cacheDifficulties: function(difficulties) {
            this.difficulties = difficulties.content;
        },
        
        _createDropdown: function() {
            var defaultDifficulty = this.difficulties[0].name;
            var difficultyButton = $('<a>').addClass('btn dropdown-toggle')
                                           .css('width', '160px')
                                           .attr({
                                               'href': '#',
                                               'data-toggle': 'dropdown'
                                           })
                                           .text(defaultDifficulty);
            
            var difficultyOptions = $('<ul>').addClass('dropdown-menu');
            $.each(this.difficulties, function(index, value) {
                var difficultyOption = $('<li><a href="#">' + value.name + '</a></li>');
                
                difficultyOptions.append(difficultyOption);
            });
            
            $('li a', difficultyOptions).click(function() {
                difficultyButton.text($(this).text());
            });
            
            this.element.addClass('btn-group')
                        .append(difficultyButton)
                        .append(difficultyOptions);
        },
        
        // _setOption is called for each individual option that is changing
        _setOption: function(key, value) {
            this._super(key, value);
        },
        
        // Use the destroy method to clean up any modifications your widget has made to the DOM
        _destroy: function() {
            
        }
    });
})(jQuery);