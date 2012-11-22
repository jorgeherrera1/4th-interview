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
                    self._cacheDifficulties(data.content);
                    self._populateDifficulties();
                }
            });
        },
        
        _cacheDifficulties: function(difficulties) {
            this.difficulties = difficulties;
        },
        
        _populateDifficulties: function() {
            var markup = '<div class="input-append">\
                              <label>Difficulty</label>\
                              <input class="input-medium" type="text" placeholder="Difficulty" />\
                              <div class="btn-group">\
                                  <button class="btn dropdown-toggle" data-toggle="dropdown">\
                                      <span class="caret"></span>\
                                  </button>\
                                  <ul class="dropdown-menu">\
                                  {{each difficulties}}\
                                      <li>\
                                          <a href="#">${name}</a>\
                                      </li>\
                                  {{/each}}\
                                  </ul>\
                              </div>\
                          </div>';
            
            $.template('difficultyTemplate', markup);
            $.tmpl('difficultyTemplate', {
                difficulties: this.difficulties
            }).appendTo(this.element);
            
            var contextElement = this.element.get();
            
            $('li a', contextElement).click(function() {
                var selectedDifficulty = $(this).text();
                
                $('input[type="text"]', contextElement).val(selectedDifficulty);
            });
        },
        
        getSelectedDifficulty: function() {
            var contextElement = this.element.get();
            
            return $('input[type="text"]', contextElement).val();
        },
        
        // _setOption is called for each individual option that is changing
        _setOption: function(key, value) {
            this._super(key, value);
        },
        
        // Use the destroy method to clean up any modifications your widget has made to the DOM
        _destroy: function() {
            this.element.empty();
        }
    });
})(jQuery);