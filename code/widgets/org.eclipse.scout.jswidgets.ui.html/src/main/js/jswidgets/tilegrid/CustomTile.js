jswidgets.CustomTile = function() {
  jswidgets.CustomTile.parent.call(this);
  this.label = null;
  this.displayStyle = scout.Tile.DisplayStyle.PLAIN;
};
scout.inherits(jswidgets.CustomTile, scout.Tile);

jswidgets.CustomTile.prototype._render = function() {
  this.$container = this.$parent.appendDiv('custom-tile');
  this.$text = this.$container.appendDiv();
  this.$container.appendDiv('block').text('1');
  this.$container.appendDiv('block').text('2');
  this.$container.appendDiv('block').text('3');
  this.$container.appendDiv('block').text('4');
  this.$container.appendDiv('block').text('5');
  this.$container.appendDiv('block').text('6');
  this.$container.appendDiv('block').text('7');
  this.$container.appendDiv('block').text('8');
  this.$container.appendDiv('block').text('9');
  this.$container.appendDiv('block').text('10');
  this.htmlComp = scout.HtmlComponent.install(this.$container, this.session);
};

jswidgets.CustomTile.prototype._renderProperties = function() {
  jswidgets.CustomTile.parent.prototype._renderProperties.call(this);
  this._renderLabel();
};

jswidgets.CustomTile.prototype.setLabel = function(label) {
  this.setProperty('label', label);
};

jswidgets.CustomTile.prototype._renderLabel = function() {
  this.$text.text(this.label);
};
