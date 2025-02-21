# provider config
terraform {
  cloud {
    organization = "rondon-sarnik"

    workspaces {
      name = "lkr-app"
    }
  }

  required_providers {
    cloudflare = {
      source  = "cloudflare/cloudflare"
      version = "~> 4.45.0"
    }
  }
}

variable "cloudflare_api_token" {
  default = ""
}

provider "cloudflare" {
  api_token = var.cloudflare_api_token
}

resource "cloudflare_workers_script" "score_backend" {
  account_id = "4180cebb0f75e57d434f27a622da70f0"
  name       = "lkr-app"
  compatibility_date = "2024-01-01"
  content    = file("main.js")
}