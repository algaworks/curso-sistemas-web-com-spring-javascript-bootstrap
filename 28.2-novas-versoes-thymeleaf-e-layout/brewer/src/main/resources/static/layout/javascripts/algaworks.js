var AW = AW || {};

AW.onSidebarToggleRequest = function(event) {
  event.preventDefault();
  $(this).blur();

  $('.js-sidebar, .js-content').toggleClass('is-toggled');
};

AW.onSearchModalShowRequest = function(event) {
  event.preventDefault();

  $('.js-search-modal').fadeIn('slow');
  $('body').addClass('aw-no-scroll');
  
  $('.js-search-modal-input').val('').select();
  
};

AW.onSearchModalCloseRequest = function(event) {
  event.preventDefault();

  $('.js-search-modal').hide();
  $('body').removeClass('aw-no-scroll');
};

//AW.onFormLoadingSubmit = function(event) {
  //event.preventDefault();

  //AW.showLoadingComponent();

  //setTimeout(function() {
  //  AW.hideLoadingComponent();
  //}, 2000);
//};

AW.showLoadingComponent = function() {
  $('.js-loading-overlay').css('display', 'table').hide().fadeIn('slow');
};

AW.hideLoadingComponent = function() {
  $('.js-loading-component').fadeOut('fast');
};

AW.initStickyTableHeaders = function() {
  if ($(window).width() >= 992) { 
    var stickyRef = $('.js-sticky-reference');
    var stickyTable = $('.js-sticky-table');

    if (stickyRef && stickyTable) {
      stickyTable.stickyTableHeaders({fixedOffset: stickyRef});
    }
  }
};

AW.onMenuGroupClick = function(event) {
  var subItems = $(this).parent().find('ul');

  if (subItems.length) {
    event.preventDefault();
    $(this).parent().toggleClass('is-expanded');
  }
};

AW.initMenu = function() {
  $('.js-menu > ul > li > a').bind('click', AW.onMenuGroupClick);
  $('.aw-menu__item .is-active').parents('.aw-menu__item').addClass('is-expanded is-active');
};

$(function() {
  if (AW.init) {
    AW.init();
  }

  AW.initMenu();
  AW.initStickyTableHeaders();
  
  // Enable Bootstrap tooltip
  $('.js-tooltip').tooltip();
  
  // Bind events
  $('.js-sidebar-toggle').bind('click', AW.onSidebarToggleRequest);
  $('.js-search-modal-trigger-show').bind('click', AW.onSearchModalShowRequest);
  $('.js-search-modal-close').bind('click', AW.onSearchModalCloseRequest);
  //$('.js-form-loading').bind('submit', AW.onFormLoadingSubmit);
});