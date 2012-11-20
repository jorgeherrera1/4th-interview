(function($) {
    $.widget('4th.difficulty', {
        // These options will be used as defaults
        options: {
            serviceUrl: null
        },

        // Set up the widget (only the first time, like a constructor)
        _create: function() {
            var self = this;
            
            $.ajax({
                url: this.options.serviceUrl,
                dataType: 'json',
                data: null,
                success: function(data, textStatus, jqXHR) {
                    self.difficulties = data;
                }
            });
            
            alert(self.difficulties);
        },
        
        // (Re)Initialize the widget (any time)
        _init: function() {
            var button = $('<a>').attr('href', '#')
                                 .data('toggle', 'difficulties')
                                 .addClass('btn dropdown-toggle')
                                 .val(this.difficulties[0])
                                 .append('<span class="caret"></span>');
            
            this.element.addClass('btn-group');
            this.element.insert(button);
        },
        
        // Use the destroy method to clean up any modifications your widget has made to the DOM
        destroy: function() {
            $.Widget.prototype.destroy.call(this);
        }
    });
})(jQuery);