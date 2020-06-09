"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports["default"] = void 0;

var _react = _interopRequireWildcard(require("react"));

function _getRequireWildcardCache() { if (typeof WeakMap !== "function") return null; var cache = new WeakMap(); _getRequireWildcardCache = function _getRequireWildcardCache() { return cache; }; return cache; }

function _interopRequireWildcard(obj) { if (obj && obj.__esModule) { return obj; } if (obj === null || _typeof(obj) !== "object" && typeof obj !== "function") { return { "default": obj }; } var cache = _getRequireWildcardCache(); if (cache && cache.has(obj)) { return cache.get(obj); } var newObj = {}; var hasPropertyDescriptor = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var key in obj) { if (Object.prototype.hasOwnProperty.call(obj, key)) { var desc = hasPropertyDescriptor ? Object.getOwnPropertyDescriptor(obj, key) : null; if (desc && (desc.get || desc.set)) { Object.defineProperty(newObj, key, desc); } else { newObj[key] = obj[key]; } } } newObj["default"] = obj; if (cache) { cache.set(obj, newObj); } return newObj; }

function _typeof(obj) { "@babel/helpers - typeof"; if (typeof Symbol === "function" && typeof Symbol.iterator === "symbol") { _typeof = function _typeof(obj) { return typeof obj; }; } else { _typeof = function _typeof(obj) { return obj && typeof Symbol === "function" && obj.constructor === Symbol && obj !== Symbol.prototype ? "symbol" : typeof obj; }; } return _typeof(obj); }

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } }

function _createClass(Constructor, protoProps, staticProps) { if (protoProps) _defineProperties(Constructor.prototype, protoProps); if (staticProps) _defineProperties(Constructor, staticProps); return Constructor; }

function _possibleConstructorReturn(self, call) { if (call && (_typeof(call) === "object" || typeof call === "function")) { return call; } return _assertThisInitialized(self); }

function _getPrototypeOf(o) { _getPrototypeOf = Object.setPrototypeOf ? Object.getPrototypeOf : function _getPrototypeOf(o) { return o.__proto__ || Object.getPrototypeOf(o); }; return _getPrototypeOf(o); }

function _assertThisInitialized(self) { if (self === void 0) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return self; }

function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function"); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, writable: true, configurable: true } }); if (superClass) _setPrototypeOf(subClass, superClass); }

function _setPrototypeOf(o, p) { _setPrototypeOf = Object.setPrototypeOf || function _setPrototypeOf(o, p) { o.__proto__ = p; return o; }; return _setPrototypeOf(o, p); }

var App = /*#__PURE__*/function (_Component) {
  _inherits(App, _Component);

  function App(propos) {
    var _this;

    _classCallCheck(this, App);

    _this = _possibleConstructorReturn(this, _getPrototypeOf(App).call(this, propos));
    _this.state = {
      measure: []
    };
    _this.addStuff = _this.addStuff.bind(_assertThisInitialized(_this));
    return _this;
  }

  _createClass(App, [{
    key: "addStuff",
    value: function addStuff() {
      var _this2 = this;

      if (document.getElementById("name_input").value == "") {
        alert("Name is empty!");
      } else if (document.getElementById("logo_input").value == "") {
        alert("Weight is empty!");
      } else {
        var a = document.getElementById("name_input").value;
        ;

        if (document.getElementById("logo_input").value == "") {
          var b = 0;
        } else {
          var b = document.getElementById("logo_input").value;
        }

        var c = document.getElementById("lengths_input").value;
        var e = c.substr(1);
        var d = document.getElementById("width_input").value;
        fetch("http://localhost:8081/item/InsertOrderServlet.do?boxname=" + a + "&countryid=" + d + "&boxWeight=" + b + "&boxcolour=" + e + "").then(function (response) {
          return response.json();
        }).then(function (response) {
          return _this2.setState({
            measure: response.data
          });
        })["catch"](function (err) {
          return console.error(err);
        });
      }
    }
  }, {
    key: "render",
    value: function render() {
      return _react["default"].createElement("div", null, _react["default"].createElement("div", {
        className: "font"
      }, "Name:"), _react["default"].createElement("div", null, _react["default"].createElement("input", {
        type: "text",
        id: "name_input",
        className: "field"
      })), _react["default"].createElement("div", {
        className: "font"
      }, "Weigth:"), _react["default"].createElement("div", null, _react["default"].createElement("input", {
        type: "text",
        id: "logo_input",
        className: "field"
      })), _react["default"].createElement("div", {
        className: "font"
      }, "BoxColor:"), _react["default"].createElement("input", {
        type: "color",
        id: "lengths_input",
        placeholder: "click to show color picker",
        className: "field"
      }), "\xA0", _react["default"].createElement("div", {
        className: "font"
      }, "Country:"), _react["default"].createElement("div", null, _react["default"].createElement("select", {
        value: this.state.value,
        onChange: this.handleChange,
        id: "width_input",
        className: "field"
      }, "\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0", _react["default"].createElement("option", {
        value: "1"
      }, "Sweden"), "\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0", _react["default"].createElement("option", {
        value: "2"
      }, "China"), "\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0", _react["default"].createElement("option", {
        value: "3"
      }, "Brazil"), "\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0", _react["default"].createElement("option", {
        value: "4"
      }, "Australia"), "\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0"), "\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0 \xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0", _react["default"].createElement("div", null, this.state.value), "\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0 \xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0\xA0"), "\xA0", _react["default"].createElement("div", null, _react["default"].createElement("button", {
        className: "button",
        onClick: this.addStuff
      }, "Save")));
    }
  }]);

  return App;
}(_react.Component);

var _default = App;
exports["default"] = _default;